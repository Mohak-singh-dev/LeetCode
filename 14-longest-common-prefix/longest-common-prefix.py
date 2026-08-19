class Solution(object):
    def longestCommonPrefix(self, strs):
        str = ""
        length = len(strs)
        strs.sort(key = len)
        for i in range(len(strs[0])):
            check = strs[0][i]
            flag = 1
            for j in range(length):
                if strs[j][i] != check:
                    flag = 0
                    break
            if flag==1:
                str +=check
            else:
                break

        return str