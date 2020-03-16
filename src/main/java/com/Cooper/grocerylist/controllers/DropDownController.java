package com.Cooper.grocerylist.controllers;

import com.Cooper.grocerylist.models.CategoryDropdownService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/dropdown")
public class DropDownController {

    @Autowired(required = true)
    private CategoryDropdownService service;

    @RequestMapping(value = “/{entity}/get.action”, method = RequestMethod.GET)
    public @ResponseBody List<DropdownOption> getDropdownList(
            @PathVariable(“entity”) String entity, HttpServletRequest request)
            throws ServletRequestBindingException {
// Get name and value property from request
        String nameProp = ServletRequestUtils.getRequiredStringParameter(
                request, “nameProp”);
        String valueProp = ServletRequestUtils.getRequiredStringParameter(
                request, “valueProp”);
        String filter = ServletRequestUtils.getStringParameter(request,
                “filter”);
        return service.getOptions(entity, nameProp, valueProp, filter);
    }
}
