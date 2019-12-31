package study.递归.递推;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @fileName: t1
 * @author: WangChen
 * @date: 2019/12/30 14:40
 * @description: 杨辉三角
 */

public class YHSJ {
    @Test
    void test() {
        //System.out.println(generate(5));
        System.out.println(getRow(5));
    }

    List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> line = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            line.add(0, 1);
            System.out.println("第"+(i+1)+"行 总："+result.toString());
            System.out.println("第"+(i+1)+"行 line："+line.toString());
            for (int j = 1; j < line.size() - 1; j++) {
                System.out.println("！！！第"+j+"个：前"+line.toString());
                line.set(j, line.get(j) + line.get(j + 1));
                System.out.println("！！！第"+j+"个：后"+line.toString());
            }
            result.add(new ArrayList<Integer>(line));
            System.out.println("第"+(i+1)+"行添加完："+result.toString());
        }
        return result;
    }

//    public List<Integer> getRow(int rowIndex) {
//        List<List<Integer>> result = new ArrayList<>();
//        List<Integer> line = new ArrayList<>();
//        for (int i = 0; i < rowIndex; i++) {
//            line.add(0, 1);
//            for (int j = 1; j < line.size() - 1; j++) {
//                line.set(j, line.get(j) + line.get(j + 1));
//            }
//            result.add(new ArrayList<Integer>(line));
//        }
//        return line;
//    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<Integer>(rowIndex+1);
        long nk = 1;
        for(int i = 0; i <= rowIndex; i++){
            res.add((int)nk);
            nk = nk * (rowIndex - i) / (i + 1);
            System.out.println(nk);
            System.out.println(res.toString());
        }
        return res;
    }
}
