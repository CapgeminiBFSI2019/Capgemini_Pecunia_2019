package com.capgemini.pecunia.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Date;

import com.capgemini.pecunia.Utility;
import com.capgemini.pecunia.dao.TransactionDAOImpl;

public class TransactionServiceImpl implements TransactionService{

	@Override
	public int creditUsingSlip(String accountId, Double amount, Date transactionDate) {
		// TODO Auto-generated method stub
		TransactionDAOImpl transactionDAOImpl = new TransactionDAOImpl();
		int transactionId = transactionDAOImpl.creditUsingSlip(accountId, amount, transactionDate);
		//return transactionId;
		//changed again
		return 0;
		
	}

	@Override
	public int creditUsingCheque(String accountId, Double amount, Date transactionDate, String checkNum,
			String chequeAccount,String chequeBankName,String chequeHolderName,String chequeIFSC,Date chequeIssueDate,String chequeStatus) {
		// TODO Auto-generated method stub
		TransactionDAOImpl transactionDAOImpl = new TransactionDAOImpl();
		int transactionId = transactionDAOImpl.creditUsingCheque(accountId,amount,transactionDate,checkNum,
				chequeAccount,chequeBankName,chequeHolderName,chequeIFSC, chequeIssueDate,chequeStatus);
		return transactionId;
	}

	@Override
	public int debitUsingSlip(String accountId, Double amount, Date transactionDate) {
		TransactionDAOImpl transactionDAOImpl = new TransactionDAOImpl();
		int transactionId = transactionDAOImpl.debitUsingSlip(accountId, amount, transactionDate);
		//return transactionId;
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int debitUsingCheque(String accountId, Double amount, Date chequeIssueDate, String checkNum,
			String chequeAccount,String chequeBankName,String chequeHolderName,String chequeIFSC,String chequeStatus,Date transactionDate) {
		TransactionDAOImpl transactionDAOImpl = new TransactionDAOImpl();
		int transactionId = transactionDAOImpl.debitUsingCheque(accountId,amount,chequeIssueDate,checkNum,
				chequeAccount,chequeBankName,chequeHolderName,chequeIFSC,chequeStatus,transactionDate);
		//return transactionId;
		//changed again
		return 0;
	
}
}
