{\rtf1\ansi\ansicpg1252\cocoartf1348\cocoasubrtf170
{\fonttbl\f0\fnil\fcharset0 HelveticaNeue-Medium;}
{\colortbl;\red255\green255\blue255;\red38\green38\blue38;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720

\f0\fs48 \cf2 \expnd0\expndtw0\kerning0
/**\
 * Definition for a binary tree node.\
 * public class TreeNode \{\
 *     int val;\
 *     TreeNode left;\
 *     TreeNode right;\
 *     TreeNode(int x) \{ val = x; \}\
 * \}\
 */\
public class Solution \{\
    public boolean isSymmetric(TreeNode root) \{\
        if(root==null)\{\
            return true;\
        \}\
        return isSymmetricLow(root.right,root.left);\
    \}\
     public boolean isSymmetricLow(TreeNode right,TreeNode left) \{\
        if(right==null&&left==null) return true;\
        if(right==null||left==null) return false;\
        if(right.val==left.val)\{\
            return isSymmetricLow(right.right,left.left)&&isSymmetricLow(right.left,left.right);\
        \}\
        return false;\
        \
    \}\
\}}