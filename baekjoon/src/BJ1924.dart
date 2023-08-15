import 'dart:io';

void main() {
  int x = int.parse(stdin.readLineSync()!); int y = int.parse(stdin.readLineSync()!);
  
  Calendar calendar = new Calendar(x: x, y: y);
  calendar.result();
}

class Calendar {
  final int x;
  final int y;
  
  int day;
  List<int> month;
  
  Calendar({
    required this.x,
    required this.y,
  }) : this.day = 0, this.month = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
  
  void result() {
    if(x > 1) {
      for(int i=0; i<x-1; i++) {
        day += month[i];
      }
    }
    
    day += y;
    
    switch(day % 7) {
      case 1:
        print("MON"); break;
      case 2:
        print("TUE"); break;
      case 3:
        print("WED"); break;
      case 4:
        print("THU"); break;
      case 5:
        print("FRI"); break;
      case 6:
        print("SAT"); break;
      case 0:
        print("SUN"); break;
    }
  }
}