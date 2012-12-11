package sample.spring.chapter02.springbankapp.controller;

import org.apache.log4j.Logger;

import sample.spring.chapter02.springbankapp.domain.FixedDepositDetails;
import sample.spring.chapter02.springbankapp.service.FixedDepositService;

public class FixedDepositControllerImpl implements FixedDepositController {
	private static Logger logger = Logger.getLogger(FixedDepositControllerImpl.class);
	
	private FixedDepositService fixedDepositService;
	
	public FixedDepositControllerImpl() {
		logger.info("initializing");
	}
	
	public FixedDepositService getFixedDepositService() {
		return fixedDepositService;
	}
	
	public void setFixedDepositService(FixedDepositService fixedDepositService) {
		logger.info("Setting fixedDepositService property");
		this.fixedDepositService = fixedDepositService;
	}
	
	public boolean submit(FixedDepositDetails fixedDepositDetails) {
		return fixedDepositService.createFixedDeposit(fixedDepositDetails);
	}
	
	public FixedDepositDetails get() {
		return fixedDepositService.getFixedDepositDetails(1L);
	}
}
