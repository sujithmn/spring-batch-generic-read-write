package com.spring.example;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

public class GenericFieldSetMapper implements FieldSetMapper<Map<String, Object>>  {

	
	
	
	private String dateFormatString;
	public void setDateFormat(String dateFormatString) {
		this.dateFormatString = dateFormatString;
	}
	
	@Override
	public Map<String, Object> mapFieldSet(FieldSet fieldSet) throws BindException {
		Map<String, Object> map = new HashMap<>();
		for(String name:fieldSet.getNames()) {
			if(name.startsWith("boolean")) {
				map.put(name, fieldSet.readBoolean(name));
			}else if(name.startsWith("int")) {
				map.put(name, fieldSet.readInt(name));
			}else if(name.startsWith("float")) {
				map.put(name, fieldSet.readFloat(name));
			}else if(name.startsWith("double")) {
				map.put(name, fieldSet.readDouble(name));
			}else if(name.startsWith("date")) {
				map.put(name, fieldSet.readDate(name,dateFormatString));
			}else {
				map.put(name, fieldSet.readString(name));
			}
		}
		return map;
	}

}
