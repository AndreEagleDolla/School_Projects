#Ryan Berwald
#DSCI 15310 -- Computational Thinking and Programming
#Program No. Final Exam
#Name of Program -- Final Exam
#Due Date -- 5/11/18

corcount = 0
incorcount = 0

name = input("Hello, my name is computer, what is your name?\n")

answer = input("What is the value of π, " + name + "?")

answer = float(answer)
answer = round(answer, 2)

if answer == 3.14:
    print("WOW! " + name + " that was correct!")
    corcount += 1
else:
    print("Dang! " + name + " that was incorrect! The correct answer was 3.14!")
    incorcount += 1

answer = input("What is the value of φ, " + name + "?")

answer = float(answer)
answer = round(answer, 2)

if answer == 1.61:
    print("WOW! " + name + " that was correct!")
    corcount += 1
else:
    print("Dang! " + name + " that was incorrect! The correct answer was 1.61!")
    incorcount += 1

answer = input("What is the value of e, the Euler number, " + name + "?")

answer = float(answer)
answer = round(answer, 2)

if answer == 2.72:
    print("WOW! " + name + " that was correct!")
    corcount += 1
else:
    print("Dang! " + name + " that was incorrect! The correct answer was 2.72!")
    incorcount += 1

answer = input("What is the value of C, the Euler constant, " + name + "?")

answer = float(answer)
answer = round(answer, 2)

if answer == .58:
    print("WOW! " + name + " that was correct!")
    corcount += 1
else:
    print("Dang! " + name + " that was incorrect! The correct answer was .58!")
    incorcount += 1

answer = input("What is the largest digit in Base 2, " + name + "?")

answer = float(answer)
answer = round(answer, 2)

if answer == 1:
    print("WOW! " + name + " that was correct!")
    corcount += 1
else:
    print("Dang! " + name + " that was incorrect! The correct answer was 1!")
    incorcount += 1

answer = input("What is the largest digit in Base 8, " + name + "?")

answer = float(answer)
answer = round(answer, 2)

if answer == 7:
    print("WOW! " + name + " that was correct!")
    corcount += 1
else:
    print("Dang! " + name + " that was incorrect! The correct answer was 7!")
    incorcount += 1


answer = input("What is the largest digit in Base 16, " + name + "?")

if answer == 'f' or 'F':
    print("WOW! " + name + " that was correct!")
    corcount += 1
else:
    print("Dang! " + name + " that was incorrect! The correct was answer F!")
    incorcount += 1


answer = input("What is the value of the multiplier effect in economics, " + name + "?")

answer = float(answer)
answer = round(answer, 2)

if answer == 2.50:
    print("WOW! " + name + " that was correct!")
    corcount += 1
else:
    print("Dang! " + name + " that was incorrect! The correct answer was 2.5!")
    incorcount += 1

answer = input("If 100 is reduced by 10%, what is the result, , " + name + "?")

answer = float(answer)
answer = round(answer, 2)

if answer == 90:
    print("WOW! " + name + " that was correct!")
    corcount += 1
else:
    print("Dang! " + name + " that was incorrect! The correct answer will be given after the next question!")
    incorcount += 1

answer = input("If the result of question 9 is increased by 10%, what is the new result, " + name + "?")

answer = float(answer)
answer = round(answer, 2)

if answer == 99:
    print("WOW! " + name + " that was correct!")
    corcount += 1
else:
    print("Dang! " + name + " that was incorrect! The correct answer was 99 to #10 and 99 to #9!")
    incorcount += 1

print("\n" + name + ", you got " + str(corcount) + " correct, and " + str(incorcount) + " incorrect!")

if corcount >= 6:
    print("Congratulations! " + name + " you passed the test!")
