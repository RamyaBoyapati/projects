package NavigableMapMethods;
//1)The NavigableMap interface of the Java collections framework provides 
//the features to navigate among the map entries.

//2)It is considered as a type of SortedMap.

//3)// NavigableMap implementation by TreeMap class
 //NavigableMap<Key, Value> numbers = new TreeMap<>();

//Methods of NavigableMap

//The NavigableMap is considered as a type of SortedMap. It is because
//NavigableMap extends the SortedMap interface.

//headMap(key, booleanValue)
//The headMap() method returns all the entries of a navigable map 
//associated with all those keys before the specified key

//tailMap(key, booleanValue)
//The tailMap() method returns all the entries of a navigable map associated
//with all those keys after the specified key (which is passed as an argument)
//including the entry associated with the specified key.

//subMap(k1, bv1, k2, bv2)
//The subMap() method returns all the entries associated with keys between
//k1 and k2 including the entry associated with k1.

//Other Methods


//The NavigableMap provides various methods that can be used to locate the 
//entries of maps.
//
//descendingMap() - reverse the order of entries in a map
//
//descendingKeyMap() - reverses the order of keys in a map
//
//ceilingEntry() - returns an entry with the lowest key among all those
//
//entries whose keys are greater than or equal to the specified key
//
//ceilingKey() - returns the lowest key among those keys that are greater 
//than or equal to the specified key
//
//floorEntry() - returns an entry with the highest key among all those entries
//whose keys are less than or equal to the specified key
//
//floorKey() - returns the highest key among those keys that are less than or
//equal to the specified key
//
//higherEntry() - returns an entry with the lowest key among all those entries
//whose keys are greater than the specified key
//
//
//higherKey() - returns the lowest key among those keys that are greater than
//the specified key
//
//lowerEntry() - returns an entry with the highest key among all those entries 
//whose keys are less than the specified key
//
//lowerKey() - returns the highest key among those keys that are less than 
//the specified key
//
//firstEntry() - returns the first entry (the entry with the lowest key) of the
//map
//
//lastEntry() - returns the last entry (the entry with the highest key) of
//the map
//
//pollFirstEntry() - returns and removes the first entry of the map
//
//pollLastEntry() - returns and removes the last entry of the map

