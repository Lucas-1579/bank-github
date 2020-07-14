package Entity;

public class Account {

		private int numAccount;
		public String nameHolder;
		private double initialDep;
		
		

		public Account(int numAccount, String nameHolder, double initialDep) {
			this.numAccount = numAccount;
			this.nameHolder = nameHolder;
			makeDeposit(initialDep);
			
		}

		public Account(int numAccount, String nomeHolder) {
			this.numAccount = numAccount;
			this.nameHolder = nomeHolder;
			
		}
		
		public int getNumAccount() {
			return numAccount;
		}

		public String getNomeHolder() {
			return nameHolder;
		}

		public void setNomeHolder(String nameHolder) {
			this.nameHolder = nameHolder;
		}

		public double getDepInicial() {
			return initialDep;
		}
		public void  makeDeposit(double deposit) {
			initialDep += deposit;
		}
		public void withdraw(double bankDrafts) {
			 initialDep -= bankDrafts + 5.00;
		}
		

		public String toString() {
			return "Account "
					+ numAccount
					+ ", Holder: "
					+ nameHolder
					+ ", Balance: $ "
					+ String.format("%.2f%n", initialDep);
					
		}
	}


