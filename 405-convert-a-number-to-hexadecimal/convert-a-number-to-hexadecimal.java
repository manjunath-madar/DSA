class Solution {
    public String toHex(int num) {

        if (num == 0) {
            return "0";
        }

        String hex = "0123456789abcdef";
        StringBuilder sb = new StringBuilder();

        while (num != 0) {

            int remd = num & 15;

            char hexDigit = hex.charAt(remd);

            sb.append(hexDigit);

            num = num >>> 4;
        }

        return sb.reverse().toString();
    }
}

