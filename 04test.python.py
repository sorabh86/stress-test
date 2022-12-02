# import datetime as dt
import time as dt

ONELAKH = 100000

with open("test-python.txt", "w") as file:
    # start = dt.datetime.now()
    start = dt.time()

    for i in range(1, ONELAKH):
        file.write(str(i)+". Python is awesome.")
    
    file.close()

    # end = dt.datetime.now()
    end = dt.time()

    diff = end - start

    # print(diff.total_seconds() * 1000, " milliseconds (python language)")
    print(diff * 1000, " milliseconds (python language)")