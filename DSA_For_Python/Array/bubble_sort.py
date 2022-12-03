arr = [10,2,8,7,6,3]
print(arr)
for x in range(len(arr)):
	for y in range(len(arr)-1-x):
		if arr[y] > arr[y+1]:
			temp = arr[y]
			arr[y] = arr[y+1]
			arr[y+1] = temp

print(arr)

