class Solution {
    public boolean detectCapitalUse(String word) {
        String uppercase = word.toUpperCase();
        String lowercase = word.toLowerCase();
        String onecapi = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
        if(word.equals(uppercase)) return true;
        if(word.equals(lowercase)) return true;
        if(word.equals(onecapi)) return true;
        return false;
    }
}