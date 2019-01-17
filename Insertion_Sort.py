'''
Created on 08.01.2019

@author: roshy
'''

def Insertion_Sort(A):
    i = 1
    for i in range(1,len(A)):
        h=A[i]
        j=i-1
        while j>=0 and A[j]>h:
            A[j+1]=A[j]
            j=j-1
        A[j+1]=h
    
A=[5,3,4,8,6]
Insertion_Sort(A)
print(A)