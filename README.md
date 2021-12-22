# Lab03_bpk
TNPG: BPK <br/>
Ben Belotser, Perry Huang, Kosta Dubovskiy <br/>
<br/>
**Tests Performed** <br/>
<br/>
Array of length 100,000,000
Search for a number not in the array with both linear and binary search. Repeat many times. <br/>
<br/>
**Test Raw Data**
<br/>
Format: {{BinTime, LinTime}, {BinTime, LinTime}, {BinTime, LinTime}, ...etc}
<br/>
<br/>
**Results** <br/>
<br/>
Array of length 100,000,000 <br/>

| Name                                        | Data         |
| ------------------------------------------- | ------------ |
| Binary search total time over 1000 tests:   | 10 <br/>     |
| Binary search average time over 1000 tests: | 0 <br/>      |
| Linear search total time over 1000 tests:   | 182392 <br/> |
| Linear search average time over 1000 tests: | 182 <br/>    |

**Conclusions** <br/>
<br/>
Total and utter defeat for linear search. Binary search is much faster every single time.<br/>
