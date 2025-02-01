
package com.phone.common;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class BaseCtl<F extends BaseForm, T extends BaseDto, S extends BaseServiceInt<T>> {

	@Autowired
	public S baseService;

	public OMMSResponse validate(BindingResult bindingResult) {

		OMMSResponse res = new OMMSResponse();
		res.setSuccess(true);

		if (bindingResult.hasErrors()) {
			res.setSuccess(false);

			Map<String, String> errors = new HashMap<String, String>();

			List<FieldError> list = bindingResult.getFieldErrors();

			list.forEach(e -> {
				errors.put(e.getField(), e.getDefaultMessage());
			});
			res.addInputError(errors);
		}

		return res;

	}

	@PostMapping("save")
	public OMMSResponse save(@RequestBody @Valid F form, BindingResult bindingResult) {

		OMMSResponse res = validate(bindingResult);
		if (!res.success) {
			return res;
		}
		T dto = (T) form.getDto();

		if (dto.getId() != null && dto.getId() > 0) {

			baseService.update(dto);
			res.addMassage("DATA UPDATED SUCCESSFULLY.....>>>>>>>>!!!!");
		} else {
			baseService.add(dto);
			res.addData(dto.getId());
			res.addMassage("DATAB ADDEDD>>> SUCCESSFULLY>>>>>?>>>>!!!!!!");
		}
		return res;
	}

	@PostMapping("search")
	public OMMSResponse search(@RequestBody F form) {
		OMMSResponse res = new OMMSResponse();
		T dto = (T) form.getDto();
		List list = baseService.search(dto, 0, 0);
		if (list.size() == 0) {
			res.addMassage("result not found....");
		} else {
			res.addData(list);
		}
		return res;

	}

	@GetMapping("get/{id}")
	public OMMSResponse get(@PathVariable long id) {

		OMMSResponse res = new OMMSResponse();
		T dto = baseService.findById(id);

		res.addData(dto);
		return res;

	}

	@GetMapping("delete/{id}")
	public OMMSResponse delete(@PathVariable long id) {
		OMMSResponse res = new OMMSResponse();
		baseService.delete(id);
		res.addMassage("data deleted successfully");
		return res;
	}

}
