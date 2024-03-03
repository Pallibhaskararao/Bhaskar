def stuff(data, flag, esc):
    result = ""
    i = 0
    while i < len(data):
        if data[i:i+8] == flag:
            result += (esc + flag)
            i += 8
        elif data[i:i+5] == esc:
            result += (esc + esc)
            i += 5
        else:
            result += data[i]
            i += 1

    return result

def destuff(Sdata, flag, esc):
    result = ""
    i = 0
    while i < len(Sdata):
        if Sdata[i:i+10] == esc + esc:
            result += esc
            i += 10
        elif Sdata[i:i+13] == esc + flag:
            result += flag
            i += 13
        else:
            result += Sdata[i]
            i += 1

    return result


esc = "11011"
print("Assume that 'Esc' pattern is 11011...because as per Ascii code 'Esc' is codeed with 27 decimal.")
data = input("Enter the data : ")
flag = "01111110"
Sdata = stuff(data, flag, esc)
print("stuffed data : ",flag + " " + Sdata + " "+ flag)
data1 = destuff(Sdata, flag, esc)
print("The destuffed data : ",data1)
