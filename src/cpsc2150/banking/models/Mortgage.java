package cpsc2150.banking.models;

/**
 * @invariant payment > 0 AND [Rate is calculated based on the BASERATE, the years for the loan, and the PercentDown]
 *
 * @correspondence self.Payment = payment AND self.Rate = rate AND self.Customer = customer
 *  AND self.DebtToIncomeRatio = debtToIncomeRatio AND self.Principal = principal
 *  AND self.NumberOfPayments = numberOfPayments AND self.PercentDown = percentDown
 */
public class Mortgage extends AbsMortgage implements IMortgage{

    double payment;
    double rate;
    ICustomer customer;
    double debtToIncomeRatio;
    double principal;
    int numberOfPayments;
    double percentDown;

    void Morgage(double costOfHome, double downPayment, int numYears, ICustomer c) {
        customer = new ICustomer(c);

        /*
        Payment: R - The monthly payment on the mortgage
                *          Rate: R - the interest rate per monthly period on the loan
 *          Customer: - Every loan must have an associated customer
 *          DebtToIncomeRatio: R - The ratio of the customer's total monthly debt payments (including mortgage) to their monthly income
                *          Principal: R - The amount of the loan
 *          NumberOfPayments: Z - total number of payments the customer will make on the loan
 *          PercentDown : R - The percent of the house cost covered by the down payment

         */
    }

    public boolean loanApproved() {

    }

    public double getPayment() {

    }

    public double getRate() {

    }

    public double getPrincipal() {

    }

    public int getYears() {

    }
}
