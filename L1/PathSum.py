#Given a binary tree and a sum, determine if the tree has a
# root-to-leaf path such that adding up all the values along the path equals the given sum.
#For example:
#Given the below binary tree and sum = 22,
#       5
#      / \
#     4   8
#    /   / \
#   11  13  4
#  /  \      \
# 7    2      1
#
# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

def pathSum(self, arr, sum):
    if not arr:
        return False

    if not arr.left and not arr.right and not sum-arr.val == sum:
        return True

    sum -= arr.val

    return self.pathSum(arr.left, sum) or self.pathSum(arr.right, sum)
