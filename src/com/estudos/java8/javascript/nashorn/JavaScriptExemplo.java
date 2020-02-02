package com.estudos.java8.javascript.nashorn;

import java.io.FileReader;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class JavaScriptExemplo {

	public static void main(String[] args) {
		
		ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");
		
		Bindings bind = ee.getBindings(ScriptContext.ENGINE_SCOPE);
		
		bind.put("goodbye", " Ate logo!!!");
		
		try {
			ee.eval(new FileReader("/home/carlos/Desktop/Estudos/studiesJavaVersions/src/com/estudos/java8/javascript/nashorn/olamundo.js"));
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
