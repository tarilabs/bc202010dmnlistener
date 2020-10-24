package com.myspace.bc202010dmnlistener;

import org.kie.dmn.api.core.event.AfterEvaluateDecisionEvent;

public class MyDecisionListener extends org.kie.dmn.core.api.event.DefaultDMNRuntimeEventListener {

	@Override
	public void afterEvaluateDecision(AfterEvaluateDecisionEvent event) {
		System.out.println("Decision " + 
							event.getDecision().getName() + 
							" evaluated with result: " +
							event.getResult().getDecisionResultByName(event.getDecision().getName()).getResult()
		);
	}
	

}