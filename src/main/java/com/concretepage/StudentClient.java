package com.concretepage;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.concretepage.wsdl.GetStudentRequest;
import com.concretepage.wsdl.GetStudentResponse;

public class StudentClient extends WebServiceGatewaySupport  {
	public GetStudentResponse getStudentById(int studentId) {
		GetStudentRequest request = new GetStudentRequest();
		request.setStudentId(studentId);
		GetStudentResponse response = (GetStudentResponse) getWebServiceTemplate().marshalSendAndReceive(
				request, new SoapActionCallback("https://localhost:8443/serviceSNRAdmin/partidosService"));
		return response;
	}
}
