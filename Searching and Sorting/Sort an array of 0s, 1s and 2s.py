#Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.

#Example:

#Input: 
#N = 5
#arr[]= {0 2 1 2 0}
#Output:
#0 0 1 2 2
#Explanation:
#0s 1s and 2s are segregated into ascending order.

#Question asked in :  Adobe, Amazon, Hike, MakeMyTrip, MAQ Software, Microsoft, Morgan Stanley, Ola Cabs, OYO Rooms, Paytm, Qualcomm, Samsung, SAP Labs,
#Snapdeal, Walmart, Yatra.com.





def sort012(arr,n):
    # code here
    arr.sort()
    return arr




#{ 
#  Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t=int(input())
    for _ in range(t):
        n=int(input())
        arr=[int(x) for x in input().strip().split()]
        sort012(arr,n)
        for i in arr:
            print(i, end=' ')
        print()

# } Driver Code Ends
