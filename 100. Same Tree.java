{\rtf1\ansi\ansicpg1252\cocoartf1348\cocoasubrtf170
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural

\f0\fs24 \cf0 public class Solution \{\
    public boolean isSameTree(TreeNode p, TreeNode q) \{\
        if(p==null&&q==null)\{\
         return true;   \
        \}\
        if(p==null&&q!=null)\{\
         return false;   \
        \}\
        if(p!=null&&q==null)\{\
         return false;   \
        \}else\{\
       \
            if(p.val==q.val)\{\
                if(isSameTree(p.left,q.left)==true&&isSameTree(p.right,q.right)==true)\{\
                    return true;\
                \}else\{\
                    return false;\
                \}\
                        \
            \}else\{\
                return false;\
            \}\
        \}\
    \}}