package com.github.lyrric.conf;

import com.github.lyrric.model.Member;

import java.util.List;

/**
 * Created on 2020-07-23.
 *
 * @author wangxiaodong
 */
public class Config {

    /**
     * 微信配置
     */
    public static String cookies = "";
    public static String tk = "";

    public static String reqHeader = "GET https://miaomiao.scmttec.com/seckill/seckill/list.do?offset=0&limit=10&regionCode=5101 HTTP/1.1\n" +
            "Host: miaomiao.scmttec.com\n" +
            "Connection: keep-alive\n" +
            "Accept: application/json, text/plain, */*\n" +
            "Cookie: _xxhm_=%7B%22headerImg%22%3A%22http%3A%2F%2Fthirdwx.qlogo.cn%2Fmmopen%2FVicSudC46JRE4NzLMxVT10fcY1SREM7zm5I2ThENE0BPxNAwISXhDcic0DhpsUAMyvGGnRhzP3SrSOTL6GFCics0VIGricFc1TH3%2F132%22%2C%22mobile%22%3A%22176****9886%22%2C%22nickName%22%3A%22%E5%A5%BD%E5%90%8D%E5%AD%97%E5%8F%AF%E4%BB%A5%E8%AE%A9%E4%BD%A0%E7%9A%84%E6%9C%8B%E5%8F%8B%E6%9B%B4%E5%AE%B9%E6%98%93%E8%AE%B0%E4%BD%8F%E4%BD%A0%22%2C%22sex%22%3A1%7D; _xzkj_=wxapptoken:10:a0dc1aaa7e1c761a1d39b5c7c42929ce_5d5cebbebe494b1fef726ae9e51784dd" +
            "User-Agent: Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36 MicroMessenger/7.0.9.501 NetType/WIFI MiniProgramEnv/Windows WindowsWechat\n" +
            "X-Requested-With: XMLHttpRequest\n" +
            "content-type: application/json\n" +
            "tk: wxapptoken:10:a0dc1aaa7e1c761a1d39b5c7c42929ce_5d5cebbebe494b1fef726ae9e51784dd\n" +
            "Referer: https://servicewechat.com/wxff8cad2e9bf18719/7/page-frame.html\n" +
            "Accept-Encoding: gzip, deflate, br\n" +
            "\n";

    /**
     * 接种成员ID
     */
    public static Integer memberId;
    /**
     * 接种成员身份证号码
     */
    public static String idCard;
    /**
     * 接种成员姓名
     */
    public static String memberName;
    /**
     * 选择的地区代码
     */
    public static String regionCode = "5101";

}
