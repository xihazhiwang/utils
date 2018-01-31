package han.utils;

import com.sun.org.apache.bcel.internal.generic.BIPUSH;

import java.math.BigDecimal;

public class SalaryUtils {

    private static BigDecimal ZERO = BigDecimal.ZERO;
    private static BigDecimal LEAVE_ONE = BigDecimal.valueOf(1500);
    private static BigDecimal LEAVE_TWO = BigDecimal.valueOf(4500);
    private static BigDecimal LEAVE_THREE = BigDecimal.valueOf(9000);
    private static BigDecimal LEAVE_FOUR = BigDecimal.valueOf(35000);
    private static BigDecimal LEAVE_FIVE = BigDecimal.valueOf(55000);
    private static BigDecimal LEAVE_SIX = BigDecimal.valueOf(80000);

    /**
     * 计算税后工资
     * @param paySalary
     * @return
     */
    public static BigDecimal afterPayTax(BigDecimal paySalary) {
        return paySalary.subtract(payTax(paySalary));
    }

    /**
     * @param paySalary     税前工资
     * @return              应缴个税
     */
    public static BigDecimal payTax(BigDecimal paySalary) {
        int flag = paySalary.compareTo(new BigDecimal(3500));
        if(flag == -1){
            return new BigDecimal(0);
        }else{
            // step 1 : 获取计税工资
            BigDecimal taxable = paySalary.subtract(new BigDecimal(3500));
            // step 2 : 获取计税等级
            int i = taxLevel(taxable);
            return tax(i, taxable);
        }
    }

    /**
     * 个税=（应付工资-3500）* 税率 - 速算扣除数
     * @param tax   计税工资
     * @param rate  税率
     * @param n     速算扣除数
     * @return      保留两位小数（四舍五入）
     */
    public static BigDecimal calcTax(BigDecimal tax, double rate, int n) {
        return tax.multiply(new BigDecimal(rate))
                .subtract(new BigDecimal(n))
                .setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    /**
     * 计算应缴纳个税
     * @param i             纳税登记
     * @param taxSalary     纳税工资
     * @return              应缴个税
     */
    public static BigDecimal tax(int i, BigDecimal taxSalary) {
        switch (i) {
            case 1  :  return calcTax(taxSalary, 0.03, 0);
            case 2  :  return calcTax(taxSalary, 0.1, 105);
            case 3  :  return calcTax(taxSalary, 0.2, 555);
            case 4  :  return calcTax(taxSalary, 0.25, 1005);
            case 5  :  return calcTax(taxSalary, 0.3, 2755);
            case 6  :  return calcTax(taxSalary, 0.35, 5505);
            case 7  :  return calcTax(taxSalary, 0.45, 13505);
            default :  return new BigDecimal(0);
        }
    }

    /**
     * 确定应缴纳税率等级
     * @param taxSalary 计税工资
     *  级数  全月应纳税所得额（含税级距） 税率（%） 速算扣除数（元）
     *  1         不超过1500               3          0
     *  2         超过1500元至4500元       10         105
     *  3         超过4500元至9000元       20         555
     *  4         超过9000元至35000元      25         1005
     *  5         超过35000元至55000元     30         2755
     *  6         超过55000元至80000元     35         5505
     *  7         超过80000元              45        13505
     *
     * @return 个税
     */
    public static int taxLevel(BigDecimal taxSalary) {
        if (taxSalary.compareTo(ZERO) <= 0) {
            return 0;
        } else if (taxSalary.compareTo(LEAVE_ONE) <= 0) {
            return 1;
        } else if (taxSalary.compareTo(LEAVE_TWO) <= 0) {
            return 2;
        } else if (taxSalary.compareTo(LEAVE_THREE) <= 0) {
            return 3;
        } else if (taxSalary.compareTo(LEAVE_FOUR) <= 0) {
            return 4;
        } else if (taxSalary.compareTo(LEAVE_FIVE) <= 0) {
            return 5;
        } else if (taxSalary.compareTo(LEAVE_SIX) <= 0) {
            return 6;
        } else if (taxSalary.compareTo(LEAVE_SIX) > 0) {
            return 7;
        } else {
            return 0;
        }
    }

}
