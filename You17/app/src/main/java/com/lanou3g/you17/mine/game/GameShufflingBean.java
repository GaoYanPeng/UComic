package com.lanou3g.you17.mine.game;
 /*
                   _ooOoo_
                  o8888888o
                  88" . "88
                  (| -_- |)
                  O\  =  /O
               ____/`---'\____
             .'  \\|     |//  `.
            /  \\|||  :  |||//  \
           /  _||||| -:- |||||-  \
           |   | \\\  -  /// |   |
           | \_|  ''\---/''  |   |
           \  .-\__  `-`  ___/-. /
         ___`. .'  /--.--\  `. . __
      ."" '<  `.___\_<|>_/___.'  >'"".
     | | :  `- \`.;`\ _ /`;.`/ - ` : | |
     \  \ `-.   \_ __\ /__ _/   .-` /  /
======`-.____`-.___\_____/___.-`____.-'======
                   `=---='
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
         佛祖保佑       永无BUG

Created by tliYgTong_刘德强 on 16/9/5.
*/


import java.util.List;

public class GameShufflingBean {

    /**
     * message : 处理成功
     * stateCode : 1
     * returnData : {"hasMore":true,"gameheader":{"recommands":[{"appId":44,"dowmLoadUrl":"http://tj.u17t.com/rpqi/click_MzE2XzIyMzNfMjQ2Mg==_MTY4MCoxMDUw","appPackageName":"com.tencent.KiHan","coverUrl":"http://static.u17i.com/wan/upload/images/20160425/975d829fu17595eu174b20u17ba02u174a0faba15715.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160425/975d829fu17595eu174b20u17ba02u174a0faba15715.png","downUrl":"http://download.u17i.com/app/game/hyrz/hyrz_20160809_yyq_1.13.16_5.apk","title":"火影忍者","gameType":"卡牌养成","size":495136784},{"appId":52,"dowmLoadUrl":"http://tj.u17t.com/8izb/click_MzI2XzI0MjNfMjY0MA==_MTY4MCoxMDUw","appPackageName":"com.xsj.girlcafegun.alpha","coverUrl":"http://static.u17i.com/wan/upload/images/20160718/e722e0bau17d915u174fdau17b17eu1771eac8f438b1.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160718/e722e0bau17d915u174fdau17b17eu1771eac8f438b1.png","downUrl":"http://download.u17i.com/app/game/snkfq/shooter_youyaoqi.apk","title":"少女咖啡枪","gameType":"删档封测","size":335757497},{"appId":64,"dowmLoadUrl":"http://tj.u17t.com/ykjf/click_MzM4XzI1OTFfMjc5OA==_MTY4MCoxMDUw","appPackageName":"com.bilibili.ichu","coverUrl":"http://static.u17i.com/wan/upload/images/20160706/907912ccu179418u174418u17ac5fu170f7cd438b235.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160706/907912ccu179418u174418u17ac5fu170f7cd438b235.png","downUrl":"http://download.u17i.com/app/game/ichuox/ICHU_20160720_yyq_1.0.4_35.apk","title":"偶像进行曲","gameType":"休闲养成","size":265408619},{"appId":54,"dowmLoadUrl":"http://tj.u17t.com/9h9p/click_MzMyXzI0ODZfMjcwMQ==_MTY4MCoxMDUw","appPackageName":"com.yunchang.djsy.yyq","coverUrl":"http://static.u17i.com/wan/upload/images/20160621/a9fc9680u171e75u174005u178389u171e486fdb130c.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160621/a9fc9680u171e75u174005u178389u171e486fdb130c.png","downUrl":"http://download.u17i.com/app/game/djsy/djsy_20160810_yyq_1.1.0.41.apk","title":"刀剑神域黑衣剑士","gameType":"卡牌养成","size":389374942},{"appId":67,"dowmLoadUrl":"http://tj.u17t.com/u4uj/click_MzQxXzI2NThfMjg1Ng==_MTY4MCoxMDUw","appPackageName":"com.heitao.eva.u17","coverUrl":"http://static.u17i.com/wan/upload/images/20160718/097dfa85u17952bu1743fdu1796a6u17d8ac23589967.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160718/097dfa85u17952bu1743fdu1796a6u17d8ac23589967.png","downUrl":"http://download.u17i.com/app/game/eva001/eva_u17_v1.1.3_2.0.0__201608231734.apk","title":"新世纪福音战士OL","gameType":"卡牌养成","size":228564274},{"appId":62,"dowmLoadUrl":"http://tj.u17t.com/i5p8/click_MzM2XzI1NDZfMjc1NQ==_MTY4MCoxMDUw","appPackageName":"com.xhhd.bleach","coverUrl":"http://static.u17i.com/wan/upload/images/20160621/b25efa6du17a9edu174b5fu17b080u171e782c901a1c.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160621/b25efa6du17a9edu174b5fu17b080u171e782c901a1c.png","downUrl":"http://download.u17i.com/app/game/ssjx/Bleach20160623_yyq_1.7.16090.apk","title":"死神觉醒","gameType":"角色扮演","size":410701690}],"banner":[{"coverUrl":"http://static.u17i.com/wan/upload/images/20160718/2ca79261u1797e7u1745e2u17ac82u1792b940143d97.jpg","type":1,"gotoUrl":"","appId":68},{"coverUrl":"http://static.u17i.com/wan/upload/images/20160718/378c6b03u171c59u174444u179ea3u175a9b1ecff865.jpg","type":2,"gotoUrl":"http://game.u17.com/m_blcs.html","appId":66},{"coverUrl":"http://static.u17i.com/wan/upload/images/20160425/2030c91bu172bbeu1744a1u17a945u17854baa4e7f6b.jpg","type":1,"gotoUrl":"","appId":54},{"coverUrl":"http://static.u17i.com/wan/upload/images/20160621/eefe1dd1u174c1eu174ae8u179b4eu17680853352f25.jpg","type":1,"gotoUrl":"","appId":62}]},"page":1,"itemList":[{"appId":52,"coverUrl":"http://static.u17i.com/wan/upload/images/20160718/c84d1a3du176efau174f42u17b446u17bd585e2d7412.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160718/e722e0bau17d915u174fdau17b17eu1771eac8f438b1.png","title":"少女咖啡枪","size":335757497,"desc":"《少女咖啡枪》9月2日删档内测，我的妹妹不可能拯救世界吧！","dowmLoadUrl":"http://tj.u17t.com/8izb/click_MzI2XzI0MjNfMjY0MA==_MTY4MCoxMDUw","downUrl":"http://download.u17i.com/app/game/snkfq/shooter_youyaoqi.apk","downloadTimes":9321,"appPackageName":"com.xsj.girlcafegun.alpha","smallPictureUrls":null,"bigPictureUrls":null,"gameType":"删档封测"},{"appId":68,"coverUrl":"http://static.u17i.com/wan/upload/images/20160718/7af1e932u17d628u17407eu17957fu17d0e1e5d91795.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160718/c0ac6d1fu17e355u174a22u1786e0u171357b24a73df.png","title":"空想加尔特","size":151551203,"desc":"加尔特的指引，黑暗未来中最后的伊甸","dowmLoadUrl":"http://tj.u17t.com/r1jx/click_MzQyXzI2NzNfMjg3MQ==_MTkyMCoxMDgw","downUrl":"http://download.u17i.com/app/game/kxjte/u17_kxjte_20160829.apk","downloadTimes":2085,"appPackageName":"com.kxjet.heyi.huawei.youku","smallPictureUrls":null,"bigPictureUrls":null,"gameType":"删档封测"},{"appId":29,"coverUrl":"http://static.u17i.com/wan/upload/images/20160718/f6c0ade4u173a4cu174a0cu179b39u17008a50f21525.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160718/305df320u17383fu174a4cu17b55bu178f3c4a6a773b.png","title":"乖离性百万亚瑟王","size":79535321,"desc":"日本超人气卡牌RPG《乖离性百万亚瑟王》有妖气首发公测！","dowmLoadUrl":"http://tj.u17t.com/4z7n/click_MzA3XzE5NThfMjE3Ng==_MTkyMCoxMDgw","downUrl":"http://download.u17i.com/app/game/glxbwysw/u17_bwysw_20160830_3.1.1.apk","downloadTimes":160142,"appPackageName":"com.ljapps.p1726.lj8","smallPictureUrls":null,"bigPictureUrls":null,"gameType":"卡牌养成"},{"appId":8,"coverUrl":"http://static.u17i.com/wan/upload/images/20160718/f67cd72fu17c1d7u1748a9u17b637u1728d5a70c1bae.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160718/e1140c6cu170e26u174b68u17af44u17d4a77c1980fb.png","title":"梅露可物语","size":171317517,"desc":"有妖气首发！最Q萌的日系手游--《梅露可物语》","dowmLoadUrl":"http://tj.u17t.com/86o9/click_MjY2XzE2MTZfMTc5Mw==_MTkyMCoxMDgw","downUrl":"http://download.u17i.com/app/game/mlk/u17_mlkwy_20160829_3.3.0_1273_prod.apk","downloadTimes":232344,"appPackageName":"com.happyelements.miraclecn.u17","smallPictureUrls":null,"bigPictureUrls":null,"gameType":"卡牌养成"},{"appId":63,"coverUrl":"http://static.u17i.com/wan/upload/images/20160718/56952c95u17c554u174618u17b511u17f5564ee70867.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160718/e265abbbu17754au1744abu178e17u17010f0d0c3513.png","title":"甜甜萌物语","size":232112209,"desc":"二次元御宅首选 萌妹3D换装游戏","dowmLoadUrl":"http://tj.u17t.com/vgqy/click_MzM3XzI1ODVfMjc5Mg==_MTY4MCoxMDUw","downUrl":"http://download.u17i.com/app/game/ttmwy/ttmwy_20160826_yyq_1.9.0.apk","downloadTimes":787769,"appPackageName":"com.bf.game.ttmwy","smallPictureUrls":null,"bigPictureUrls":null,"gameType":"休闲养成"},{"appId":65,"coverUrl":"http://static.u17i.com/wan/upload/images/20160718/b05d445du17aba7u174bdeu1795feu17ad8fa225d2b1.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160718/4acfa20cu17338eu17462du17be71u178ed32dea888e.png","title":"天域幻想","size":290623577,"desc":"东方神话动漫幻想题材3D全景飞天卡牌手游","dowmLoadUrl":"http://tj.u17t.com/9ok9/click_MzM5XzI2MzNfMjgzNA==_MTY4MCoxMDUw","downUrl":"http://download.u17i.com/app/game/tyhx/u17_tyhx_1.2.0_45077_20160826.apk","downloadTimes":4475,"appPackageName":"com.xishanju.tggame.azsy","smallPictureUrls":null,"bigPictureUrls":null,"gameType":"卡牌养成"},{"appId":67,"coverUrl":"http://static.u17i.com/wan/upload/images/20160718/8c600516u170802u174cb4u17b757u172d143289f183.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160718/097dfa85u17952bu1743fdu1796a6u17d8ac23589967.png","title":"新世纪福音战士OL","size":228564274,"desc":"极致还原  信仰重燃  400%EVA同步率","dowmLoadUrl":"http://tj.u17t.com/u4uj/click_MzQxXzI2NThfMjg1Ng==_MTY4MCoxMDUw","downUrl":"http://download.u17i.com/app/game/eva001/eva_u17_v1.1.3_2.0.0__201608231734.apk","downloadTimes":4182,"appPackageName":"com.heitao.eva.u17","smallPictureUrls":null,"bigPictureUrls":null,"gameType":"卡牌养成"},{"appId":66,"coverUrl":"http://static.u17i.com/wan/upload/images/20160718/d886ade4u17050eu17425du179b07u179ab4c6268840.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160718/377e2352u170ed4u17486cu179ecdu1783a204608099.png","title":"百炼成神","size":62076933,"desc":"有妖气同名漫画改编手游《百炼成神》沸血来袭！","dowmLoadUrl":"http://tj.u17t.com/nh5w/click_MzQwXzI2NDlfMjg0Nw==_MTY4MCoxMDUw","downUrl":"http://download.u17i.com/app/game/blcs/u17_blcs_20160819_1055.apk","downloadTimes":5699,"appPackageName":"com.zhwq.blcs.oacg","smallPictureUrls":null,"bigPictureUrls":null,"gameType":"策略养成"},{"appId":61,"coverUrl":"http://static.u17i.com/wan/upload/images/20160718/a40a54f3u17d35eu1742a3u17a6f0u17ac4fd72bd02a.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160718/48e6cfa5u17048eu17419fu17a9f8u177866f39c58a2.jpg","title":"夏日甜心","size":287584994,"desc":"日本超一线CV配音，顶级听觉盛宴；真实美少女养成，打造你的专属女友！","dowmLoadUrl":"http://tj.u17t.com/qmpm/click_MzM1XzI1NDNfMjc1Mg==_MTY4MCoxMDUw","downUrl":"http://download.u17i.com/app/game/yssn2/release_X10074A_xrtx_Andorid_1.1.7_201608162051.apk","downloadTimes":147956,"appPackageName":"com.skymoons.ys2.skymoons","smallPictureUrls":null,"bigPictureUrls":null,"gameType":"删档封测"},{"appId":56,"coverUrl":"http://static.u17i.com/wan/upload/images/20160425/dd46cf03u17e188u17496cu1782e2u17cdf7106e0198.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160425/bd95d5f2u17eef0u174d4fu17bc67u179715a61afbcb.png","title":"山海战记","size":311218393,"desc":"山海战记是一款架空历史，幻想风二次元萌系塔防手游大作，经典塔防玩法，丰富策略与副本，精致画面，炫酷特效，等你来战!","dowmLoadUrl":"http://tj.u17t.com/vif9/click_MzI5XzI0NjZfMjY4MQ==_MTY4MCoxMDUw","downUrl":"http://download.u17i.com/app/game/shzj/shzj_20160818_yyq_3.15.1.apk","downloadTimes":596488,"appPackageName":"com.smiletech.shzj.u17","smallPictureUrls":null,"bigPictureUrls":null,"gameType":"卡牌养成"}],"Last_Modified":1473068179000}
     */

    private DataBean data;
    /**
     * data : {"message":"处理成功","stateCode":1,"returnData":{"hasMore":true,"gameheader":{"recommands":[{"appId":44,"dowmLoadUrl":"http://tj.u17t.com/rpqi/click_MzE2XzIyMzNfMjQ2Mg==_MTY4MCoxMDUw","appPackageName":"com.tencent.KiHan","coverUrl":"http://static.u17i.com/wan/upload/images/20160425/975d829fu17595eu174b20u17ba02u174a0faba15715.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160425/975d829fu17595eu174b20u17ba02u174a0faba15715.png","downUrl":"http://download.u17i.com/app/game/hyrz/hyrz_20160809_yyq_1.13.16_5.apk","title":"火影忍者","gameType":"卡牌养成","size":495136784},{"appId":52,"dowmLoadUrl":"http://tj.u17t.com/8izb/click_MzI2XzI0MjNfMjY0MA==_MTY4MCoxMDUw","appPackageName":"com.xsj.girlcafegun.alpha","coverUrl":"http://static.u17i.com/wan/upload/images/20160718/e722e0bau17d915u174fdau17b17eu1771eac8f438b1.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160718/e722e0bau17d915u174fdau17b17eu1771eac8f438b1.png","downUrl":"http://download.u17i.com/app/game/snkfq/shooter_youyaoqi.apk","title":"少女咖啡枪","gameType":"删档封测","size":335757497},{"appId":64,"dowmLoadUrl":"http://tj.u17t.com/ykjf/click_MzM4XzI1OTFfMjc5OA==_MTY4MCoxMDUw","appPackageName":"com.bilibili.ichu","coverUrl":"http://static.u17i.com/wan/upload/images/20160706/907912ccu179418u174418u17ac5fu170f7cd438b235.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160706/907912ccu179418u174418u17ac5fu170f7cd438b235.png","downUrl":"http://download.u17i.com/app/game/ichuox/ICHU_20160720_yyq_1.0.4_35.apk","title":"偶像进行曲","gameType":"休闲养成","size":265408619},{"appId":54,"dowmLoadUrl":"http://tj.u17t.com/9h9p/click_MzMyXzI0ODZfMjcwMQ==_MTY4MCoxMDUw","appPackageName":"com.yunchang.djsy.yyq","coverUrl":"http://static.u17i.com/wan/upload/images/20160621/a9fc9680u171e75u174005u178389u171e486fdb130c.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160621/a9fc9680u171e75u174005u178389u171e486fdb130c.png","downUrl":"http://download.u17i.com/app/game/djsy/djsy_20160810_yyq_1.1.0.41.apk","title":"刀剑神域黑衣剑士","gameType":"卡牌养成","size":389374942},{"appId":67,"dowmLoadUrl":"http://tj.u17t.com/u4uj/click_MzQxXzI2NThfMjg1Ng==_MTY4MCoxMDUw","appPackageName":"com.heitao.eva.u17","coverUrl":"http://static.u17i.com/wan/upload/images/20160718/097dfa85u17952bu1743fdu1796a6u17d8ac23589967.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160718/097dfa85u17952bu1743fdu1796a6u17d8ac23589967.png","downUrl":"http://download.u17i.com/app/game/eva001/eva_u17_v1.1.3_2.0.0__201608231734.apk","title":"新世纪福音战士OL","gameType":"卡牌养成","size":228564274},{"appId":62,"dowmLoadUrl":"http://tj.u17t.com/i5p8/click_MzM2XzI1NDZfMjc1NQ==_MTY4MCoxMDUw","appPackageName":"com.xhhd.bleach","coverUrl":"http://static.u17i.com/wan/upload/images/20160621/b25efa6du17a9edu174b5fu17b080u171e782c901a1c.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160621/b25efa6du17a9edu174b5fu17b080u171e782c901a1c.png","downUrl":"http://download.u17i.com/app/game/ssjx/Bleach20160623_yyq_1.7.16090.apk","title":"死神觉醒","gameType":"角色扮演","size":410701690}],"banner":[{"coverUrl":"http://static.u17i.com/wan/upload/images/20160718/2ca79261u1797e7u1745e2u17ac82u1792b940143d97.jpg","type":1,"gotoUrl":"","appId":68},{"coverUrl":"http://static.u17i.com/wan/upload/images/20160718/378c6b03u171c59u174444u179ea3u175a9b1ecff865.jpg","type":2,"gotoUrl":"http://game.u17.com/m_blcs.html","appId":66},{"coverUrl":"http://static.u17i.com/wan/upload/images/20160425/2030c91bu172bbeu1744a1u17a945u17854baa4e7f6b.jpg","type":1,"gotoUrl":"","appId":54},{"coverUrl":"http://static.u17i.com/wan/upload/images/20160621/eefe1dd1u174c1eu174ae8u179b4eu17680853352f25.jpg","type":1,"gotoUrl":"","appId":62}]},"page":1,"itemList":[{"appId":52,"coverUrl":"http://static.u17i.com/wan/upload/images/20160718/c84d1a3du176efau174f42u17b446u17bd585e2d7412.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160718/e722e0bau17d915u174fdau17b17eu1771eac8f438b1.png","title":"少女咖啡枪","size":335757497,"desc":"《少女咖啡枪》9月2日删档内测，我的妹妹不可能拯救世界吧！","dowmLoadUrl":"http://tj.u17t.com/8izb/click_MzI2XzI0MjNfMjY0MA==_MTY4MCoxMDUw","downUrl":"http://download.u17i.com/app/game/snkfq/shooter_youyaoqi.apk","downloadTimes":9321,"appPackageName":"com.xsj.girlcafegun.alpha","smallPictureUrls":null,"bigPictureUrls":null,"gameType":"删档封测"},{"appId":68,"coverUrl":"http://static.u17i.com/wan/upload/images/20160718/7af1e932u17d628u17407eu17957fu17d0e1e5d91795.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160718/c0ac6d1fu17e355u174a22u1786e0u171357b24a73df.png","title":"空想加尔特","size":151551203,"desc":"加尔特的指引，黑暗未来中最后的伊甸","dowmLoadUrl":"http://tj.u17t.com/r1jx/click_MzQyXzI2NzNfMjg3MQ==_MTkyMCoxMDgw","downUrl":"http://download.u17i.com/app/game/kxjte/u17_kxjte_20160829.apk","downloadTimes":2085,"appPackageName":"com.kxjet.heyi.huawei.youku","smallPictureUrls":null,"bigPictureUrls":null,"gameType":"删档封测"},{"appId":29,"coverUrl":"http://static.u17i.com/wan/upload/images/20160718/f6c0ade4u173a4cu174a0cu179b39u17008a50f21525.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160718/305df320u17383fu174a4cu17b55bu178f3c4a6a773b.png","title":"乖离性百万亚瑟王","size":79535321,"desc":"日本超人气卡牌RPG《乖离性百万亚瑟王》有妖气首发公测！","dowmLoadUrl":"http://tj.u17t.com/4z7n/click_MzA3XzE5NThfMjE3Ng==_MTkyMCoxMDgw","downUrl":"http://download.u17i.com/app/game/glxbwysw/u17_bwysw_20160830_3.1.1.apk","downloadTimes":160142,"appPackageName":"com.ljapps.p1726.lj8","smallPictureUrls":null,"bigPictureUrls":null,"gameType":"卡牌养成"},{"appId":8,"coverUrl":"http://static.u17i.com/wan/upload/images/20160718/f67cd72fu17c1d7u1748a9u17b637u1728d5a70c1bae.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160718/e1140c6cu170e26u174b68u17af44u17d4a77c1980fb.png","title":"梅露可物语","size":171317517,"desc":"有妖气首发！最Q萌的日系手游--《梅露可物语》","dowmLoadUrl":"http://tj.u17t.com/86o9/click_MjY2XzE2MTZfMTc5Mw==_MTkyMCoxMDgw","downUrl":"http://download.u17i.com/app/game/mlk/u17_mlkwy_20160829_3.3.0_1273_prod.apk","downloadTimes":232344,"appPackageName":"com.happyelements.miraclecn.u17","smallPictureUrls":null,"bigPictureUrls":null,"gameType":"卡牌养成"},{"appId":63,"coverUrl":"http://static.u17i.com/wan/upload/images/20160718/56952c95u17c554u174618u17b511u17f5564ee70867.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160718/e265abbbu17754au1744abu178e17u17010f0d0c3513.png","title":"甜甜萌物语","size":232112209,"desc":"二次元御宅首选 萌妹3D换装游戏","dowmLoadUrl":"http://tj.u17t.com/vgqy/click_MzM3XzI1ODVfMjc5Mg==_MTY4MCoxMDUw","downUrl":"http://download.u17i.com/app/game/ttmwy/ttmwy_20160826_yyq_1.9.0.apk","downloadTimes":787769,"appPackageName":"com.bf.game.ttmwy","smallPictureUrls":null,"bigPictureUrls":null,"gameType":"休闲养成"},{"appId":65,"coverUrl":"http://static.u17i.com/wan/upload/images/20160718/b05d445du17aba7u174bdeu1795feu17ad8fa225d2b1.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160718/4acfa20cu17338eu17462du17be71u178ed32dea888e.png","title":"天域幻想","size":290623577,"desc":"东方神话动漫幻想题材3D全景飞天卡牌手游","dowmLoadUrl":"http://tj.u17t.com/9ok9/click_MzM5XzI2MzNfMjgzNA==_MTY4MCoxMDUw","downUrl":"http://download.u17i.com/app/game/tyhx/u17_tyhx_1.2.0_45077_20160826.apk","downloadTimes":4475,"appPackageName":"com.xishanju.tggame.azsy","smallPictureUrls":null,"bigPictureUrls":null,"gameType":"卡牌养成"},{"appId":67,"coverUrl":"http://static.u17i.com/wan/upload/images/20160718/8c600516u170802u174cb4u17b757u172d143289f183.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160718/097dfa85u17952bu1743fdu1796a6u17d8ac23589967.png","title":"新世纪福音战士OL","size":228564274,"desc":"极致还原  信仰重燃  400%EVA同步率","dowmLoadUrl":"http://tj.u17t.com/u4uj/click_MzQxXzI2NThfMjg1Ng==_MTY4MCoxMDUw","downUrl":"http://download.u17i.com/app/game/eva001/eva_u17_v1.1.3_2.0.0__201608231734.apk","downloadTimes":4182,"appPackageName":"com.heitao.eva.u17","smallPictureUrls":null,"bigPictureUrls":null,"gameType":"卡牌养成"},{"appId":66,"coverUrl":"http://static.u17i.com/wan/upload/images/20160718/d886ade4u17050eu17425du179b07u179ab4c6268840.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160718/377e2352u170ed4u17486cu179ecdu1783a204608099.png","title":"百炼成神","size":62076933,"desc":"有妖气同名漫画改编手游《百炼成神》沸血来袭！","dowmLoadUrl":"http://tj.u17t.com/nh5w/click_MzQwXzI2NDlfMjg0Nw==_MTY4MCoxMDUw","downUrl":"http://download.u17i.com/app/game/blcs/u17_blcs_20160819_1055.apk","downloadTimes":5699,"appPackageName":"com.zhwq.blcs.oacg","smallPictureUrls":null,"bigPictureUrls":null,"gameType":"策略养成"},{"appId":61,"coverUrl":"http://static.u17i.com/wan/upload/images/20160718/a40a54f3u17d35eu1742a3u17a6f0u17ac4fd72bd02a.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160718/48e6cfa5u17048eu17419fu17a9f8u177866f39c58a2.jpg","title":"夏日甜心","size":287584994,"desc":"日本超一线CV配音，顶级听觉盛宴；真实美少女养成，打造你的专属女友！","dowmLoadUrl":"http://tj.u17t.com/qmpm/click_MzM1XzI1NDNfMjc1Mg==_MTY4MCoxMDUw","downUrl":"http://download.u17i.com/app/game/yssn2/release_X10074A_xrtx_Andorid_1.1.7_201608162051.apk","downloadTimes":147956,"appPackageName":"com.skymoons.ys2.skymoons","smallPictureUrls":null,"bigPictureUrls":null,"gameType":"删档封测"},{"appId":56,"coverUrl":"http://static.u17i.com/wan/upload/images/20160425/dd46cf03u17e188u17496cu1782e2u17cdf7106e0198.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160425/bd95d5f2u17eef0u174d4fu17bc67u179715a61afbcb.png","title":"山海战记","size":311218393,"desc":"山海战记是一款架空历史，幻想风二次元萌系塔防手游大作，经典塔防玩法，丰富策略与副本，精致画面，炫酷特效，等你来战!","dowmLoadUrl":"http://tj.u17t.com/vif9/click_MzI5XzI0NjZfMjY4MQ==_MTY4MCoxMDUw","downUrl":"http://download.u17i.com/app/game/shzj/shzj_20160818_yyq_3.15.1.apk","downloadTimes":596488,"appPackageName":"com.smiletech.shzj.u17","smallPictureUrls":null,"bigPictureUrls":null,"gameType":"卡牌养成"}],"Last_Modified":1473068179000}}
     * code : 1
     */

    private int code;

    public DataBean getData () {
        return data;
    }

    public void setData (DataBean data) {
        this.data = data;
    }

    public int getCode () {
        return code;
    }

    public void setCode (int code) {
        this.code = code;
    }

    public static class DataBean {
        private String message;
        private int stateCode;
        /**
         * hasMore : true
         * gameheader : {"recommands":[{"appId":44,"dowmLoadUrl":"http://tj.u17t.com/rpqi/click_MzE2XzIyMzNfMjQ2Mg==_MTY4MCoxMDUw","appPackageName":"com.tencent.KiHan","coverUrl":"http://static.u17i.com/wan/upload/images/20160425/975d829fu17595eu174b20u17ba02u174a0faba15715.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160425/975d829fu17595eu174b20u17ba02u174a0faba15715.png","downUrl":"http://download.u17i.com/app/game/hyrz/hyrz_20160809_yyq_1.13.16_5.apk","title":"火影忍者","gameType":"卡牌养成","size":495136784},{"appId":52,"dowmLoadUrl":"http://tj.u17t.com/8izb/click_MzI2XzI0MjNfMjY0MA==_MTY4MCoxMDUw","appPackageName":"com.xsj.girlcafegun.alpha","coverUrl":"http://static.u17i.com/wan/upload/images/20160718/e722e0bau17d915u174fdau17b17eu1771eac8f438b1.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160718/e722e0bau17d915u174fdau17b17eu1771eac8f438b1.png","downUrl":"http://download.u17i.com/app/game/snkfq/shooter_youyaoqi.apk","title":"少女咖啡枪","gameType":"删档封测","size":335757497},{"appId":64,"dowmLoadUrl":"http://tj.u17t.com/ykjf/click_MzM4XzI1OTFfMjc5OA==_MTY4MCoxMDUw","appPackageName":"com.bilibili.ichu","coverUrl":"http://static.u17i.com/wan/upload/images/20160706/907912ccu179418u174418u17ac5fu170f7cd438b235.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160706/907912ccu179418u174418u17ac5fu170f7cd438b235.png","downUrl":"http://download.u17i.com/app/game/ichuox/ICHU_20160720_yyq_1.0.4_35.apk","title":"偶像进行曲","gameType":"休闲养成","size":265408619},{"appId":54,"dowmLoadUrl":"http://tj.u17t.com/9h9p/click_MzMyXzI0ODZfMjcwMQ==_MTY4MCoxMDUw","appPackageName":"com.yunchang.djsy.yyq","coverUrl":"http://static.u17i.com/wan/upload/images/20160621/a9fc9680u171e75u174005u178389u171e486fdb130c.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160621/a9fc9680u171e75u174005u178389u171e486fdb130c.png","downUrl":"http://download.u17i.com/app/game/djsy/djsy_20160810_yyq_1.1.0.41.apk","title":"刀剑神域黑衣剑士","gameType":"卡牌养成","size":389374942},{"appId":67,"dowmLoadUrl":"http://tj.u17t.com/u4uj/click_MzQxXzI2NThfMjg1Ng==_MTY4MCoxMDUw","appPackageName":"com.heitao.eva.u17","coverUrl":"http://static.u17i.com/wan/upload/images/20160718/097dfa85u17952bu1743fdu1796a6u17d8ac23589967.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160718/097dfa85u17952bu1743fdu1796a6u17d8ac23589967.png","downUrl":"http://download.u17i.com/app/game/eva001/eva_u17_v1.1.3_2.0.0__201608231734.apk","title":"新世纪福音战士OL","gameType":"卡牌养成","size":228564274},{"appId":62,"dowmLoadUrl":"http://tj.u17t.com/i5p8/click_MzM2XzI1NDZfMjc1NQ==_MTY4MCoxMDUw","appPackageName":"com.xhhd.bleach","coverUrl":"http://static.u17i.com/wan/upload/images/20160621/b25efa6du17a9edu174b5fu17b080u171e782c901a1c.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160621/b25efa6du17a9edu174b5fu17b080u171e782c901a1c.png","downUrl":"http://download.u17i.com/app/game/ssjx/Bleach20160623_yyq_1.7.16090.apk","title":"死神觉醒","gameType":"角色扮演","size":410701690}],"banner":[{"coverUrl":"http://static.u17i.com/wan/upload/images/20160718/2ca79261u1797e7u1745e2u17ac82u1792b940143d97.jpg","type":1,"gotoUrl":"","appId":68},{"coverUrl":"http://static.u17i.com/wan/upload/images/20160718/378c6b03u171c59u174444u179ea3u175a9b1ecff865.jpg","type":2,"gotoUrl":"http://game.u17.com/m_blcs.html","appId":66},{"coverUrl":"http://static.u17i.com/wan/upload/images/20160425/2030c91bu172bbeu1744a1u17a945u17854baa4e7f6b.jpg","type":1,"gotoUrl":"","appId":54},{"coverUrl":"http://static.u17i.com/wan/upload/images/20160621/eefe1dd1u174c1eu174ae8u179b4eu17680853352f25.jpg","type":1,"gotoUrl":"","appId":62}]}
         * page : 1
         * itemList : [{"appId":52,"coverUrl":"http://static.u17i.com/wan/upload/images/20160718/c84d1a3du176efau174f42u17b446u17bd585e2d7412.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160718/e722e0bau17d915u174fdau17b17eu1771eac8f438b1.png","title":"少女咖啡枪","size":335757497,"desc":"《少女咖啡枪》9月2日删档内测，我的妹妹不可能拯救世界吧！","dowmLoadUrl":"http://tj.u17t.com/8izb/click_MzI2XzI0MjNfMjY0MA==_MTY4MCoxMDUw","downUrl":"http://download.u17i.com/app/game/snkfq/shooter_youyaoqi.apk","downloadTimes":9321,"appPackageName":"com.xsj.girlcafegun.alpha","smallPictureUrls":null,"bigPictureUrls":null,"gameType":"删档封测"},{"appId":68,"coverUrl":"http://static.u17i.com/wan/upload/images/20160718/7af1e932u17d628u17407eu17957fu17d0e1e5d91795.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160718/c0ac6d1fu17e355u174a22u1786e0u171357b24a73df.png","title":"空想加尔特","size":151551203,"desc":"加尔特的指引，黑暗未来中最后的伊甸","dowmLoadUrl":"http://tj.u17t.com/r1jx/click_MzQyXzI2NzNfMjg3MQ==_MTkyMCoxMDgw","downUrl":"http://download.u17i.com/app/game/kxjte/u17_kxjte_20160829.apk","downloadTimes":2085,"appPackageName":"com.kxjet.heyi.huawei.youku","smallPictureUrls":null,"bigPictureUrls":null,"gameType":"删档封测"},{"appId":29,"coverUrl":"http://static.u17i.com/wan/upload/images/20160718/f6c0ade4u173a4cu174a0cu179b39u17008a50f21525.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160718/305df320u17383fu174a4cu17b55bu178f3c4a6a773b.png","title":"乖离性百万亚瑟王","size":79535321,"desc":"日本超人气卡牌RPG《乖离性百万亚瑟王》有妖气首发公测！","dowmLoadUrl":"http://tj.u17t.com/4z7n/click_MzA3XzE5NThfMjE3Ng==_MTkyMCoxMDgw","downUrl":"http://download.u17i.com/app/game/glxbwysw/u17_bwysw_20160830_3.1.1.apk","downloadTimes":160142,"appPackageName":"com.ljapps.p1726.lj8","smallPictureUrls":null,"bigPictureUrls":null,"gameType":"卡牌养成"},{"appId":8,"coverUrl":"http://static.u17i.com/wan/upload/images/20160718/f67cd72fu17c1d7u1748a9u17b637u1728d5a70c1bae.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160718/e1140c6cu170e26u174b68u17af44u17d4a77c1980fb.png","title":"梅露可物语","size":171317517,"desc":"有妖气首发！最Q萌的日系手游--《梅露可物语》","dowmLoadUrl":"http://tj.u17t.com/86o9/click_MjY2XzE2MTZfMTc5Mw==_MTkyMCoxMDgw","downUrl":"http://download.u17i.com/app/game/mlk/u17_mlkwy_20160829_3.3.0_1273_prod.apk","downloadTimes":232344,"appPackageName":"com.happyelements.miraclecn.u17","smallPictureUrls":null,"bigPictureUrls":null,"gameType":"卡牌养成"},{"appId":63,"coverUrl":"http://static.u17i.com/wan/upload/images/20160718/56952c95u17c554u174618u17b511u17f5564ee70867.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160718/e265abbbu17754au1744abu178e17u17010f0d0c3513.png","title":"甜甜萌物语","size":232112209,"desc":"二次元御宅首选 萌妹3D换装游戏","dowmLoadUrl":"http://tj.u17t.com/vgqy/click_MzM3XzI1ODVfMjc5Mg==_MTY4MCoxMDUw","downUrl":"http://download.u17i.com/app/game/ttmwy/ttmwy_20160826_yyq_1.9.0.apk","downloadTimes":787769,"appPackageName":"com.bf.game.ttmwy","smallPictureUrls":null,"bigPictureUrls":null,"gameType":"休闲养成"},{"appId":65,"coverUrl":"http://static.u17i.com/wan/upload/images/20160718/b05d445du17aba7u174bdeu1795feu17ad8fa225d2b1.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160718/4acfa20cu17338eu17462du17be71u178ed32dea888e.png","title":"天域幻想","size":290623577,"desc":"东方神话动漫幻想题材3D全景飞天卡牌手游","dowmLoadUrl":"http://tj.u17t.com/9ok9/click_MzM5XzI2MzNfMjgzNA==_MTY4MCoxMDUw","downUrl":"http://download.u17i.com/app/game/tyhx/u17_tyhx_1.2.0_45077_20160826.apk","downloadTimes":4475,"appPackageName":"com.xishanju.tggame.azsy","smallPictureUrls":null,"bigPictureUrls":null,"gameType":"卡牌养成"},{"appId":67,"coverUrl":"http://static.u17i.com/wan/upload/images/20160718/8c600516u170802u174cb4u17b757u172d143289f183.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160718/097dfa85u17952bu1743fdu1796a6u17d8ac23589967.png","title":"新世纪福音战士OL","size":228564274,"desc":"极致还原  信仰重燃  400%EVA同步率","dowmLoadUrl":"http://tj.u17t.com/u4uj/click_MzQxXzI2NThfMjg1Ng==_MTY4MCoxMDUw","downUrl":"http://download.u17i.com/app/game/eva001/eva_u17_v1.1.3_2.0.0__201608231734.apk","downloadTimes":4182,"appPackageName":"com.heitao.eva.u17","smallPictureUrls":null,"bigPictureUrls":null,"gameType":"卡牌养成"},{"appId":66,"coverUrl":"http://static.u17i.com/wan/upload/images/20160718/d886ade4u17050eu17425du179b07u179ab4c6268840.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160718/377e2352u170ed4u17486cu179ecdu1783a204608099.png","title":"百炼成神","size":62076933,"desc":"有妖气同名漫画改编手游《百炼成神》沸血来袭！","dowmLoadUrl":"http://tj.u17t.com/nh5w/click_MzQwXzI2NDlfMjg0Nw==_MTY4MCoxMDUw","downUrl":"http://download.u17i.com/app/game/blcs/u17_blcs_20160819_1055.apk","downloadTimes":5699,"appPackageName":"com.zhwq.blcs.oacg","smallPictureUrls":null,"bigPictureUrls":null,"gameType":"策略养成"},{"appId":61,"coverUrl":"http://static.u17i.com/wan/upload/images/20160718/a40a54f3u17d35eu1742a3u17a6f0u17ac4fd72bd02a.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160718/48e6cfa5u17048eu17419fu17a9f8u177866f39c58a2.jpg","title":"夏日甜心","size":287584994,"desc":"日本超一线CV配音，顶级听觉盛宴；真实美少女养成，打造你的专属女友！","dowmLoadUrl":"http://tj.u17t.com/qmpm/click_MzM1XzI1NDNfMjc1Mg==_MTY4MCoxMDUw","downUrl":"http://download.u17i.com/app/game/yssn2/release_X10074A_xrtx_Andorid_1.1.7_201608162051.apk","downloadTimes":147956,"appPackageName":"com.skymoons.ys2.skymoons","smallPictureUrls":null,"bigPictureUrls":null,"gameType":"删档封测"},{"appId":56,"coverUrl":"http://static.u17i.com/wan/upload/images/20160425/dd46cf03u17e188u17496cu1782e2u17cdf7106e0198.png","largeCoverUrl":"http://static.u17i.com/wan/upload/images/20160425/bd95d5f2u17eef0u174d4fu17bc67u179715a61afbcb.png","title":"山海战记","size":311218393,"desc":"山海战记是一款架空历史，幻想风二次元萌系塔防手游大作，经典塔防玩法，丰富策略与副本，精致画面，炫酷特效，等你来战!","dowmLoadUrl":"http://tj.u17t.com/vif9/click_MzI5XzI0NjZfMjY4MQ==_MTY4MCoxMDUw","downUrl":"http://download.u17i.com/app/game/shzj/shzj_20160818_yyq_3.15.1.apk","downloadTimes":596488,"appPackageName":"com.smiletech.shzj.u17","smallPictureUrls":null,"bigPictureUrls":null,"gameType":"卡牌养成"}]
         * Last_Modified : 1473068179000
         */

        private ReturnDataBean returnData;

        public String getMessage () {
            return message;
        }

        public void setMessage (String message) {
            this.message = message;
        }

        public int getStateCode () {
            return stateCode;
        }

        public void setStateCode (int stateCode) {
            this.stateCode = stateCode;
        }

        public ReturnDataBean getReturnData () {
            return returnData;
        }

        public void setReturnData (ReturnDataBean returnData) {
            this.returnData = returnData;
        }

        public static class ReturnDataBean {
            private boolean hasMore;
            private GameheaderBean gameheader;
            private int page;
            private long Last_Modified;
            /**
             * appId : 52
             * coverUrl : http://static.u17i.com/wan/upload/images/20160718/c84d1a3du176efau174f42u17b446u17bd585e2d7412.png
             * largeCoverUrl : http://static.u17i.com/wan/upload/images/20160718/e722e0bau17d915u174fdau17b17eu1771eac8f438b1.png
             * title : 少女咖啡枪
             * size : 335757497
             * desc : 《少女咖啡枪》9月2日删档内测，我的妹妹不可能拯救世界吧！
             * dowmLoadUrl : http://tj.u17t.com/8izb/click_MzI2XzI0MjNfMjY0MA==_MTY4MCoxMDUw
             * downUrl : http://download.u17i.com/app/game/snkfq/shooter_youyaoqi.apk
             * downloadTimes : 9321
             * appPackageName : com.xsj.girlcafegun.alpha
             * smallPictureUrls : null
             * bigPictureUrls : null
             * gameType : 删档封测
             */

            private List<ItemListBean> itemList;

            public boolean isHasMore () {
                return hasMore;
            }

            public void setHasMore (boolean hasMore) {
                this.hasMore = hasMore;
            }

            public GameheaderBean getGameheader () {
                return gameheader;
            }

            public void setGameheader (GameheaderBean gameheader) {
                this.gameheader = gameheader;
            }

            public int getPage () {
                return page;
            }

            public void setPage (int page) {
                this.page = page;
            }

            public long getLast_Modified () {
                return Last_Modified;
            }

            public void setLast_Modified (long Last_Modified) {
                this.Last_Modified = Last_Modified;
            }

            public List<ItemListBean> getItemList () {
                return itemList;
            }

            public void setItemList (List<ItemListBean> itemList) {
                this.itemList = itemList;
            }

            public static class GameheaderBean {
                /**
                 * appId : 44
                 * dowmLoadUrl : http://tj.u17t.com/rpqi/click_MzE2XzIyMzNfMjQ2Mg==_MTY4MCoxMDUw
                 * appPackageName : com.tencent.KiHan
                 * coverUrl : http://static.u17i.com/wan/upload/images/20160425/975d829fu17595eu174b20u17ba02u174a0faba15715.png
                 * largeCoverUrl : http://static.u17i.com/wan/upload/images/20160425/975d829fu17595eu174b20u17ba02u174a0faba15715.png
                 * downUrl : http://download.u17i.com/app/game/hyrz/hyrz_20160809_yyq_1.13.16_5.apk
                 * title : 火影忍者
                 * gameType : 卡牌养成
                 * size : 495136784
                 */

                private List<RecommandsBean> recommands;
                /**
                 * coverUrl : http://static.u17i.com/wan/upload/images/20160718/2ca79261u1797e7u1745e2u17ac82u1792b940143d97.jpg
                 * type : 1
                 * gotoUrl :
                 * appId : 68
                 */

                private List<BannerBean> banner;

                public List<RecommandsBean> getRecommands () {
                    return recommands;
                }

                public void setRecommands (List<RecommandsBean> recommands) {
                    this.recommands = recommands;
                }

                public List<BannerBean> getBanner () {
                    return banner;
                }

                public void setBanner (List<BannerBean> banner) {
                    this.banner = banner;
                }

                public static class RecommandsBean {
                    private int appId;
                    private String dowmLoadUrl;
                    private String appPackageName;
                    private String coverUrl;
                    private String largeCoverUrl;
                    private String downUrl;
                    private String title;
                    private String gameType;
                    private int size;

                    public int getAppId () {
                        return appId;
                    }

                    public void setAppId (int appId) {
                        this.appId = appId;
                    }

                    public String getDowmLoadUrl () {
                        return dowmLoadUrl;
                    }

                    public void setDowmLoadUrl (String dowmLoadUrl) {
                        this.dowmLoadUrl = dowmLoadUrl;
                    }

                    public String getAppPackageName () {
                        return appPackageName;
                    }

                    public void setAppPackageName (String appPackageName) {
                        this.appPackageName = appPackageName;
                    }

                    public String getCoverUrl () {
                        return coverUrl;
                    }

                    public void setCoverUrl (String coverUrl) {
                        this.coverUrl = coverUrl;
                    }

                    public String getLargeCoverUrl () {
                        return largeCoverUrl;
                    }

                    public void setLargeCoverUrl (String largeCoverUrl) {
                        this.largeCoverUrl = largeCoverUrl;
                    }

                    public String getDownUrl () {
                        return downUrl;
                    }

                    public void setDownUrl (String downUrl) {
                        this.downUrl = downUrl;
                    }

                    public String getTitle () {
                        return title;
                    }

                    public void setTitle (String title) {
                        this.title = title;
                    }

                    public String getGameType () {
                        return gameType;
                    }

                    public void setGameType (String gameType) {
                        this.gameType = gameType;
                    }

                    public int getSize () {
                        return size;
                    }

                    public void setSize (int size) {
                        this.size = size;
                    }
                }

                public static class BannerBean {
                    private String coverUrl;
                    private int type;
                    private String gotoUrl;
                    private int appId;

                    public String getCoverUrl () {
                        return coverUrl;
                    }

                    public void setCoverUrl (String coverUrl) {
                        this.coverUrl = coverUrl;
                    }

                    public int getType () {
                        return type;
                    }

                    public void setType (int type) {
                        this.type = type;
                    }

                    public String getGotoUrl () {
                        return gotoUrl;
                    }

                    public void setGotoUrl (String gotoUrl) {
                        this.gotoUrl = gotoUrl;
                    }

                    public int getAppId () {
                        return appId;
                    }

                    public void setAppId (int appId) {
                        this.appId = appId;
                    }
                }
            }

            public static class ItemListBean {
                private int appId;
                private String coverUrl;
                private String largeCoverUrl;
                private String title;
                private int size;
                private String desc;
                private String dowmLoadUrl;
                private String downUrl;
                private int downloadTimes;
                private String appPackageName;
                private Object smallPictureUrls;
                private Object bigPictureUrls;
                private String gameType;

                public int getAppId () {
                    return appId;
                }

                public void setAppId (int appId) {
                    this.appId = appId;
                }

                public String getCoverUrl () {
                    return coverUrl;
                }

                public void setCoverUrl (String coverUrl) {
                    this.coverUrl = coverUrl;
                }

                public String getLargeCoverUrl () {
                    return largeCoverUrl;
                }

                public void setLargeCoverUrl (String largeCoverUrl) {
                    this.largeCoverUrl = largeCoverUrl;
                }

                public String getTitle () {
                    return title;
                }

                public void setTitle (String title) {
                    this.title = title;
                }

                public int getSize () {
                    return size;
                }

                public void setSize (int size) {
                    this.size = size;
                }

                public String getDesc () {
                    return desc;
                }

                public void setDesc (String desc) {
                    this.desc = desc;
                }

                public String getDowmLoadUrl () {
                    return dowmLoadUrl;
                }

                public void setDowmLoadUrl (String dowmLoadUrl) {
                    this.dowmLoadUrl = dowmLoadUrl;
                }

                public String getDownUrl () {
                    return downUrl;
                }

                public void setDownUrl (String downUrl) {
                    this.downUrl = downUrl;
                }

                public int getDownloadTimes () {
                    return downloadTimes;
                }

                public void setDownloadTimes (int downloadTimes) {
                    this.downloadTimes = downloadTimes;
                }

                public String getAppPackageName () {
                    return appPackageName;
                }

                public void setAppPackageName (String appPackageName) {
                    this.appPackageName = appPackageName;
                }

                public Object getSmallPictureUrls () {
                    return smallPictureUrls;
                }

                public void setSmallPictureUrls (Object smallPictureUrls) {
                    this.smallPictureUrls = smallPictureUrls;
                }

                public Object getBigPictureUrls () {
                    return bigPictureUrls;
                }

                public void setBigPictureUrls (Object bigPictureUrls) {
                    this.bigPictureUrls = bigPictureUrls;
                }

                public String getGameType () {
                    return gameType;
                }

                public void setGameType (String gameType) {
                    this.gameType = gameType;
                }
            }
        }
    }
}
