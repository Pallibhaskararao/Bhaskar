def stuff(data):
    result = ""
    i = 0
    while i < len(data):
        if data[i:i+6] == "011111":
            result += "0111110"
            i += 6
        else:
            result += data[i]
            i += 1

    return result
def destuff(Sdata):
    result = ""
    i = 0
    while i < len(Sdata):
        if Sdata[i:i+7] == "0111110":
            result += "011111"
            i += 7
        else:
            result += Sdata[i]
            i += 1

    return result
data = input("Enter the data: ")
Sdata= stuff(data)
print("The stuffed data :", Sdata)
data1 = destuff(Sdata)
print("The destuffed data :", data1)
