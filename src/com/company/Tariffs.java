package com.company;



public class Tariffs {

        private String tatiff_name;
        private String operator;
        private String payroll;
        private CallPrices callPrices = new CallPrices();
        private String smsPrices;
        private Parameters parameters = new Parameters();


    public String getOperator () {
            return operator;
        }

        public void setOperator (String operator){
            this.operator = operator;
        }

        public String getPayroll () {
            return payroll;
        }

        public void setPayroll (String payroll){
            this.payroll = payroll;
        }

        public String getTatiff_name () {
            return tatiff_name;
        }

        public void setTatiff_name (String tatiff_name){
            this.tatiff_name = tatiff_name;
        }

        public CallPrices getCallPrices () {
            return callPrices;
        }

        public void setCallPrices (CallPrices callPrices){
            this.callPrices = callPrices;
        }

        public String getSmsPrices () {
            return smsPrices;
        }

        public void setSmsPrices (String smsPrices){
            this.smsPrices = smsPrices;
        }

        public Parameters getParameters () {
            return parameters;
        }

        public void setParameters (Parameters parameters){
            this.parameters = parameters;
        }

}
