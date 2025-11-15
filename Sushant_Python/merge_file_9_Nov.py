
def func(num1,n,num2,m):
    i=n-1
    j=m-1
    k=m+n-1

    while j>=0:

        if i>=0 and num1[i]>=num2[j]:
            num1[k]=num1[i]
            i-=1
        else:
            num1[k]=num2[j]
            j-=1
        k-=1


if __name__ == '__main__':
    num1=[1,2,3,4,5,6,0,0,0,0]
    num2=[1,2,3,4]
    n=6
    m=len(num2)
    func(num1,n,num2,m)
    print(num1)