# Java Web Practices

**Language:** Java 1.8.0  
**Tools:** NetBeans IDE 8.2, UMLet 14.2  

## Lab01
**BMI Calculator:**
>Build a MVC structure project for BMI calculation, create own interfaces, classes, exceptions.  

## Lab02
**Avg Calculator:**
>Same practice as Lab01 with some revision, StringBuilder, JOptionPane.showInputDialog(), JOptionPane.showMessageDialog().

## Lab03
**MVC Framework:**
>Build a MVC Framework, use "Request" to replace "Model" and store all values, use "Factory" to return the choosed Controller (ex. Bmi or Avg)

## Lab04
**Template and Container:**
>Build Controller's template for multiple types controller, and make a container to store all controllers for repeatedly use, input command by a txt file.  

## Lab05
**Client and Server:**
>Establish a listening thread to wait request from client, communication data through socket -> I/O stream -> I/O stream W/R -> Buffer W/R  
Context: My mini Tomcat, build singleton Context to support attributes access, build singleton Container to support controllers management.  

## Lab06
**Web Servlet:**
>NetBean enviroment setting, build a simple servlet for test.  
**Log folder:** AppData\Roaming\NetBeans\8.2\apache-tomcat-8.0.27.0_base\logs  

## Lab07
**Bmi JSP:**
>CmKgForm.html -> bmi.jsp  

## Lab08
**Anniversary MVC:**
>Build anniversary inquiry page in MVC strcuture  
**Model (Class):** AnniversaryRecord.java, AnniversaryModel.java  
**View (html, JSP):** index.html (In),  anniversaryView.jsp (Out)  
**Controller (Servlet):** AnniversaryController.java  

**Address MVC:**
>Build address input form in MVC structure  
**Model (Class):** AddressModel.java  
**View (html, JSP):** addressForm.html (In), showAddress.jsp (Out)  
**Controller (Servlet):** AddressController.java  

## Lab09
**Header:**
>**HeaderServlet:** A simple servlet to print out all the headers  
**Client:** A basic java class to send request and check the 'user-agent' header  

## Lab10
**Web.xml:**
>Use the web.xml as the Deployment Descriptor(DD) and initialize parameters  
**Context Parameter:** email, cm, kg  
**NewServlet:** urlPatterns="/PathToServlet/\*" sc.getInitParameter() -> email  
**BmiServlet:** urlPatterns="/BmiServlet/\*" this.getInitParameter() -> cm, kg  
**BmiJsp:** urlPatterns="/BmiJsp" config.getInitParameter() -> cm, kg  

## Lab11
**checkbox:**  
>POST form element "checkbox" by html and JSP; check attributes in request, session, servletContext  
**interestForm(HTML/JSP):** \<form> POST interest:String[] -> InterestServlet  
**InterestServlet:** interest:String[] -> request, session, servletContext -> programmingForm  
**programmingForm(HTML/JSP):** \<form> POST -> programming:String[] -> ProgrammingServlet  
**ProgrammingServlet:** programming:String[] -> request, session, servletContext -> result_view  
**result_view:** display the attributes by scriplet  

## Lab12
**EL JSTL:**
>**EL:** Expression Language  
**JSTL:** Java server pages Standard Tag Library  
  
Build Customer/Address models and print out the values by EL/JavaBeans in JSP view  
**Address:** model class Address, implements Serializable for JavaBeans  
**addressBean(JSP):** init Address object, set/get property by JavaBeans  
  
**Customer:** model class Customer, include address:Address[]  
**selectCustomer(HTML):** \<form> custId -> SelectCustomerServlet  
**SelectCustomerServlet:** custId -> request -> CustomerView  
**customerView(JSP):** request -> print out by ${(scope).key.field}  
* if no scope assigned, the prority to find object is pageScope -> requestScope -> sessionScope -> applicationScope  
* ${map[key]} -> the key is Object, if numeric, default "long", not "int"  
  
Build bmi model and print out cm,kg,bmi by JavaBeans in JSP view  
**Bmi:** model Bmi, implements Serializable for JavaBeans  
**bmiForm(HTML):** \<form> cm,kg -> bmiViewController  
**bmiViewController(JSP):** set cm,kg by JavaBeans, print out by EL  

Install JSTL library(\*.jar) and test by the following:  
**jstlDemo(JSP):** add taglib for prefix="c"   
* \<c:remove> remove object  
* \<c:catch> catch exception  
* \<c:if> test condition  
* \<c:out> print out html script syntax  
  
Static include files by JSP Directive  
**bmi_static_include(JSP):** Main page included JSPF header/form/footer by \<%@ include file="filename" %>  

Dynamic include pages by JSTL  
**bmi_dynamic_include(JSP):** Main page included JSP header/form/footer by \<jsp:include page="path" />  

