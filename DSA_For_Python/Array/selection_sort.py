arr = [10,2,8,7,6,3]
print(arr)

for x in range(len(arr)):
	min_index = x
	for y in range(x+1,len(arr)):
		if arr[y]<arr[min_index]:
			min_index = y
	(arr[x],arr[min_index]) = (arr[min_index],arr[x])


print(arr)