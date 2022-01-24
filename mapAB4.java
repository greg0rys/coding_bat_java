/**
* Instructions: 
* Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths, then set "c" to have the longer value. If the values * exist and have the same length, change them both to the empty string in the map.
* View the problem here: https://codingbat.com/prob/p136950
*/


public Map<String, String> mapAB4(Map<String, String> map) {
  boolean hasVal = map.get("a") != null && map.get("b") != null ? true : false;
 // if a's key and b's keys have values check through them and modify the map
  if(hasVal){
    // a and b do not have null keys
    if(map.get("a").length() > map.get("b").length()){
      // a's value is longer
      String aString = map.get("a");
      map.put("c", aString);
    } else if(map.get("b").length() > map.get("a").length()) {
      // b's value is longer
      String bString = map.get("b");
      map.put("c", bString);
    } else if(map.get("a").length() == map.get("b").length()){
      // both a and b are of equal length
      map.put("a","");
      map.put("b","");
    }
    
    }

  
// return the modified map
  return map;
}

