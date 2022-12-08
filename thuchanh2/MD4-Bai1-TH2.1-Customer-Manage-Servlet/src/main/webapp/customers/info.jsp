
<%@ page import="rikkei.academy.service.CustomerService" %>
<%@ page import="rikkei.academy.service.CustomerServiceFactory" %>
<%@ page import="rikkei.academy.model.Customer" %>

<form action="<%=request.getContextPath()%>/CustomerServlet/Update" method="post">
    <fieldset>
        <legend>Customer Information</legend>
        <input type="hidden" name="id" value="${customerUpdate.id}">
        <table>
            <tr>
                <td>Id</td>
                <td>
                   ${customerUpdate.id}
                </td>
            </tr>
            <tr>
                <td>Name</td>
                <td>
                    <input type="text" name="name" value="${customerUpdate.name}">
                </td>
            </tr>
            <tr>
                <td>Email</td>
                <td>
                    <input type="text" name="email" value="${customerUpdate.email}">
                </td>
            </tr>
            <tr>
                <td>Address</td>
                <td>
                    <input type="text" name="address" value="${customerUpdate.address}">
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Update">
                </td>
            </tr>
        </table>
    </fieldset>
</form>
<a href="/customers/list.jsp">Back to list</a>.