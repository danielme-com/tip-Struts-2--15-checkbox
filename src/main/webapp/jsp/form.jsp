<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd"> 
<html>
	<head>
		<s:include value="/jsp/head.jsp" />	        
	</head>
	
	<body>
	   
		<s:form action="submitData" method="POST">	
					
			<s:checkbox name="checkboxSimple" label="%{getText('checkboxSimple')}"/>
			
			<s:checkboxlist label="%{getText('checkboxList')}_1" list="countries" name="countriesCheckbox" value="countriesSelected"/>
								
			<s:checkboxlist label="%{getText('checkboxList')}_2" list="countriesObject" name="countriesCheckbox" listValue="name" listKey="code"/>
			
			<s:checkboxlist label="%{getText('checkboxList')}_Map" list="#{'v1':'label1', 'v2':'label2', 'v3':'label3'}" name="countriesCheckbox"/>			
								
			<s:submit value="%{getText('submit')}"/>  			
		</s:form>
		
		<s:include value="/jsp/footer.jsp" />
		
	</body>
</html>