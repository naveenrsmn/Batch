package com.training;

public class InsuranceAgent {

	private String AgentName;
	
	public String getAgentName() {
		return AgentName;
	}

	public void setAgentName(String agentName) {
		AgentName = agentName;
	}

	public InsuranceAgent(String agentName) {
		super();
		AgentName = agentName;
	}

	public InsuranceAgent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double calculatePremium(LifeInsurance Policy)
	{
		double Premium=(Policy.getPolicyAmount())/10.00;
		return Premium;
	}
}
