package com.ispan.eeit19527.cpbl.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;

import com.ispan.eeit19527.cpbl.domain.CPBLBean;
import com.ispan.eeit19527.cpbl.repository.CPBLRepository;
import com.ispan.eeit19527.cpbl.service.CPBLService;

@Controller
public class CPBLController {

	@Autowired
	private CPBLService cpblService;
	
	@Autowired
	private CPBLRepository cPBLRepository;
	
	@PostMapping("/cpbl")
	public String method(Model model, CPBLBean cPBLBean, BindingResult bindingResult, String playerModify, String playerQuery, String name, String teamName, Integer season) {
		Map<String, String> errors = new HashMap<>();
		model.addAttribute("errors", errors);
		if(bindingResult.hasFieldErrors("season")) {
			errors.put("season","season必須是整數");
		}
		if(bindingResult.hasFieldErrors("g")) {
			errors.put("g","g必須是整數");
		}
		if(bindingResult.hasFieldErrors("pa")) {
			errors.put("pa","pa必須是整數");
		}
		if(bindingResult.hasFieldErrors("rbi")) {
			errors.put("rbi","rbi必須是整數");
		}
		if(bindingResult.hasFieldErrors("h")) {
			errors.put("h","h必須是整數");
		}
		if(bindingResult.hasFieldErrors("hr")) {
			errors.put("hr","hr必須是整數");
		}
		if(bindingResult.hasFieldErrors("tb")) {
			errors.put("tb","tb必須是整數");
		}
		if(bindingResult.hasFieldErrors("so")) {
			errors.put("so","so必須是整數");
		}
		if(bindingResult.hasFieldErrors("sf")) {
			errors.put("sf","sf必須是整數");
		}
		if(bindingResult.hasFieldErrors("bb")) {
			errors.put("bb","bb必須是整數");
		}
		
		if(errors != null && !errors.isEmpty()) {
			System.out.println(errors);
			System.out.println(bindingResult.getAllErrors());
			return "/cpbl";
		}
		//下面處理按鈕
		
		if (playerModify != null) {
		    switch (playerModify) {
		        case "新增":
		            cpblService.insert(cPBLBean);
		            model.addAttribute("insert", cPBLBean);
		            return "/cpbl";
		        case "修改":
		            cpblService.update(cPBLBean);
		            model.addAttribute("insert", cPBLBean);
		            return "/cpbl";
		        case "刪除":
		            cpblService.deleteById(cPBLBean.getId());
		            model.addAttribute("delete", "刪除一筆資料");
		            return "/cpbl";
		    }
		}

		if(playerQuery != null) {
			List<CPBLBean> list = cPBLRepository.findPlayersByCriteria(name, teamName, season);
			if(list == null || list.isEmpty()) {
				model.addAttribute("count", 0);
			}else {
				model.addAttribute("query", list);
				model.addAttribute("count", list.size());
			}
		return "/display";
		}
		return "/cpbl";
	}
	
}
