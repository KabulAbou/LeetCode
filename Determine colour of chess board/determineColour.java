class Solution {
    public boolean squareIsWhite(String coordinates) {
        if(Math.toIntExact(coordinates.charAt(1))% 2 != 0 && (coordinates.charAt(0) == 'a' 
        || coordinates.charAt(0) == 'c' || coordinates.charAt(0) == 'e' || coordinates.charAt(0) == 'g')) {
            return false;
        } else {
            return true;
        }
    }

   
}