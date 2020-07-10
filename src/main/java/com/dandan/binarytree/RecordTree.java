package com.dandan.binarytree;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: tangdandan
 * @Date: 2020/7/10 10:56
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RecordTree {
    //树
    TreeNode tree;
    //所在层数
    int level;
    //位置
    int position;
}
