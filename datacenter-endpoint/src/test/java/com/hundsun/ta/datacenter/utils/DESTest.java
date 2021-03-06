/**
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.hundsun.ta.datacenter.utils;

import org.junit.Test;

/**
 * @author wangpeng17355
 * @version $Id: DESTest, v0.1 2018年11月17日 11:15 AM wangpeng17355 Exp $
 */
public  class DESTest {

    public static void main(String[] args) throws Exception {
        /**
         *
         ETFANDTA4("1","ETFANDTA4","分TA和自建拆分"),
         TA4ANDYJTA("2","TA4ANDYJTA","自建和瑜伽TA拆分"),
         TA4ANDRTTA("3","TA4ANDRTTA","自建和实时TA拆分"),
         ETFANDTA4ANDYJTA("4","ETFANDTA4ANDYJTA","三系统拆分");
         7aXYin5fDvM45aKzG7YcTA==
         ETFANDTA4
         7vDw0b21bqrcSgjz/TKEpQ==
         TA4ANDYJTA
         hZgonXeVDCDcSgjz/TKEpQ==
         TA4ANDRTTA
         7aXYin5fDvPgnLUDhMR3d4wth5um40JJ
         ETFANDTA4ANDYJTA
         l2L0P92+eVs=
         fkfta
         ku3kwJuhLuOMLYebpuNCSQ==
         11111111
         */
        DESUtil desUtil = new DESUtil();
        String data = "ETFANDTA4";
        System.out.println(desUtil.encrypt(data));
        System.out.println(desUtil.decrypt(desUtil.encrypt(data)));
         data = "TA4ANDYJTA";
        System.out.println(desUtil.encrypt(data));
        System.out.println(desUtil.decrypt(desUtil.encrypt(data)));
         data = "TA4ANDRTTA";
        System.out.println(desUtil.encrypt(data));
        System.out.println(desUtil.decrypt(desUtil.encrypt(data)));
         data = "ETFANDTA4ANDYJTA";
        System.out.println(desUtil.encrypt(data));
        System.out.println(desUtil.decrypt(desUtil.encrypt(data)));
        data = "fkfta";
        System.out.println(desUtil.encrypt(data));
        System.out.println(desUtil.decrypt(desUtil.encrypt(data)));
        data = "11111111";
        System.out.println(desUtil.encrypt(data));
        System.out.println(desUtil.decrypt(desUtil.encrypt(data)));
        data = "Cfcs2_TA";
        System.out.println(desUtil.encrypt(data));
        System.out.println(desUtil.decrypt(desUtil.encrypt(data)));

    }

}