var x = 0;
var y = 0;

x = if (y == 0) x + 1 else x - 1

var c = 'X'

x = c match {
  case 'X' => 100
  case 'V' => 5
  case 'I' => 1
  case _ => -1
}


while (x < 10) {
  x = x + 1
  y = x + x
}

println(y)

for (x <- 1 to 10) yield x * x

for (x <- 1 to 10) println(x * x)

for (x <- 1 to 10 if x % 2 == 0) yield x * x
