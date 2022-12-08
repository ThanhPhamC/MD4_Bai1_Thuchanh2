<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page import="java.util.List" %>
<%@ page import="rikkei.academy.service.CustomerService" %>
<%@ page import="rikkei.academy.service.CustomerServiceFactory" %>
<%@ page import="rikkei.academy.model.Customer" %>
<%!
    private CustomerService customerService = CustomerServiceFactory.getInstance();
%>

<style>
    table {
        border: 1px solid #000;
    }
    th, td {
        border: 1px dotted #555;
    }
</style>

<table>
    <caption>Customers List</caption>
    <thead>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Address</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${customers}" var="c">
    <tr>
        <td>
            ${c.id}
        </td>
        <td>
            <a href="<%=request.getContextPath()%>/CustomerServlet/detail?id=${c.id}">${c.name}</a>
        </td>
        <td>
            ${c.email}
        </td>
        <td>
            ${c.address}
        </td>
    </tr>
    </c:forEach>
    </tbody>
</table>