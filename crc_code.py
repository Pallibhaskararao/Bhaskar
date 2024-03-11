def xor(a, b):
    result = []
    for i in range(len(b)):
        if a[i] == b[i]:
            result.append('0')
        else:
            result.append('1')
    return ''.join(result)

def mod2div(dividend, divisor):
    pick = len(divisor)
    tmp = dividend[0: pick]
    while pick < len(dividend):
        if tmp[0] == '1':
            tmp = xor(divisor, tmp) + dividend[pick]
        else:
            tmp = xor('0'*pick, tmp) + dividend[pick]
        pick += 1
    if tmp[0] == '1':
        tmp = xor(divisor, tmp)
    else:
        tmp = xor('0'*pick, tmp)
    return tmp

def encode_data(data, key):
    k_length = len(key)
    padded_data = data + '0'*(k_length-1)
    rem = mod2div(padded_data, key)
    encoded_data = data + rem
    return encoded_data, rem

def crc_check(data, key):
    _, remainder = encode_data(data, key)
    return all(bit == '0' for bit in remainder)

data = "100100"
key = "1101"

encoded_data, remainder = encode_data(data, key)
print("Encoded Data (Data + Remainder) : ", encoded_data)
print("Remainder : ", remainder)

received_data = "100100011"
error_detected = crc_check(received_data, key)
print("Error Detected:", not error_detected)
