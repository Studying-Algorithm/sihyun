import 'dart:io';

List<int> month = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];

void main() {
  int x = int.parse(stdin.readLineSync()!); int y = int.parse(stdin.readLineSync()!);

  print(WhatDay(Day(x, y)));
}

int Day(int x, int y) {
  int day = 0;
    
  if(x > 1) {
    for(int i=0; i<x-1; i++) {
      day += month[i];
    }
  }

  day += y;
  return day;
}

String WhatDay(int day) {
  switch(day % 7) {
    case 1:
      return "MON";
    case 2:
      return "TUE";
    case 3:
      return "WED";
    case 4:
      return "THU";
    case 5:
      return "FRI";
    case 6:
      return "SAT";
    case 0:
      return "SUN";
  }
  
  return "";
}