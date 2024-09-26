# try:

# file = open(".\\7-file\\miofile.txt")
file = open("./7-file/miofile.txt")


print(file.read())

file.close()

#     for line in file:
#         print(line, end="")
# except FileNotFoundError as error:
#     print("File not found")
# except IOError as ioerror:
#     print("errore file")
# finally:
#     file.close()