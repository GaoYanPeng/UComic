package com.lanou3g.you17.search.SearchTopGridView;
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

Created by Android_刘德强 on 16/9/23.
*/


import java.util.List;

//一级界面点击上方四个GridView进入详情后Bean
public class SearchHottestBean {
    /**
     * code : 1
     * msg : 执行成功
     * data : {"stateCode":1,"message":"成功","returnData":{"comics":[{"conTag":"44520","cover":"http://cover2.u17i.com/2014/10/12647_1413948764_xeZ2KC11sccR.sbig.jpg","name":"端脑","comicId":13707,"description":"《端脑》简介：端脑是什么？如果从字面意思来讲，端脑就是由左右两个大脑组成的生物器官。在这部故事里，它用来描述由对冲宇宙构成的庞大系统，我们叫它端脑宇宙，故事从一个个未知的杀人案开始，逐步揭开掩藏在整个宇宙中的巨大秘密，从骇人听闻的阴谋，到银河系战争，从反人类的背叛到伟大的牺牲，人类从来未曾了解自己是如此的落后，如此的弱小，她将对自己的命运做出最后的一搏。","flag":1,"tags":["少年","科幻","推理","恐怖"],"author":"壁水羽"},{"conTag":"18312","cover":"http://cover2.u17i.com/2012/07/1952_1341213481_Z98LsHLH86hV.sbig.jpg","name":"大汉夜郎歌","comicId":30889,"description":"Cosplay少女、古夜郎国王子、少数民族婚服\u2026穿越？不重要！重要的是，所有的扣子只有对方才能解开！OMG\u2014\u2014想换衣服吗？跟我成亲吧~","flag":3,"tags":["少女","魔幻","恋爱","战争"],"author":"左亲"},{"conTag":"22680","cover":"http://cover2.u17i.com/2011/03/1220_1299246894_HD8fu5hf9M93.sbig.jpg","name":"女儿国传奇－胜男篇","comicId":1405,"description":"传说女儿国女尊男卑，出身贵族的男子可配得好女子，而低贱出身的男子则被随意倒卖为奴为俾。胜男是平凡无奇的现代普通女中学生，但事实并非如此，一次学校的闹鬼事件让她穿越成为女儿国身世显赫的小王爷。","flag":1,"tags":["少女","搞笑","魔幻","生活","恋爱"],"author":"王曼"},{"conTag":"17472","cover":"http://cover2.u17i.com/2015/09/814430_1441179949_RhocGCq7hbRG.sbig.jpg","name":"超能杀场","comicId":91434,"description":"为了金钱铤而走险的一场生存游戏.这里是名副其实的杀戮战场!在这里，唯一要做的就是触发能力来保全自己!!","flag":0,"tags":["少年","科幻"],"author":"阎魔大王"},{"conTag":"16296","cover":"http://cover2.u17i.com/2012/07/18708_1342409500_oUZzNesnm0rr.sbig.jpg","name":"我，女机器人1＋2部","comicId":3420,"description":"这是一个女机器人的爆笑科幻动作漫画。\r\n天才少女身患绝症离世，在未来以机器人的身躯复活！超人气科幻漫画再度开载，女机器人2，强势来袭！","flag":3,"tags":["少年","动作","科幻"],"author":"父子漫画组合"},{"conTag":"11592","cover":"http://cover2.u17i.com/2015/07/631752_1436854356_jAHE9nfeO3Me.sbig.jpg","name":"死神的阴谋","comicId":2965,"description":"什么是生，什么是死，什么是人，什么是神","flag":1,"tags":["少年","魔幻","推理","恐怖"],"author":"壁水羽"},{"conTag":"10584","cover":"http://cover2.u17i.com/2016/02/1860_1454667448_3IjH54NwlS59.sbig.jpg","name":"神契 幻奇谭","comicId":12772,"description":"官方QQ4群：161797922\r\n官方新浪微博：神契official\r\n千年前，众神离开了地球，但他们留下了各自的神器，随着华夏儿女的血脉延续传承，期待有朝一日，可以利用神器的力量重返人间\u2026鸿钧学院高中部的学生会，是一个叫做\u201c极乐池\u201d的奇怪组织，所有成员都是拥有神器的\u201c初子\u201d。新成员花仪的加入，牵扯出了\u201c极乐池\u201d会长\u2014华炼一段隐晦岁月，而九州来袭的夜晚，众人则得知了一个更加不可思议的秘密\u2026\u2026","flag":0,"tags":["少年","魔幻","动作"],"author":"L_DART"},{"conTag":"14280","cover":"http://cover2.u17i.com/2015/02/9604_1424833519_5o5cAWo2g32P.sbig.jpg","name":"某非提的逗B日常","comicId":91341,"description":"国产手游舰N同人，非提的日常记录。国之将亡，满地舰娘；玄不救非，氪不改命；绿血不大破，大破不进击；平时多攒盆，活动不伤肝。推图进沟，五见院长四T劣；日常大破，十发大建九高雄。","flag":0,"tags":["四格","生活","同人"],"author":"大米"},{"conTag":"6552","cover":"http://cover2.u17i.com/2014/10/3892974_1413371183_wcH4o4KHtpqW.sbig.jpg","name":"丑男变美女","comicId":83116,"description":"该作品版权属《美蓝漫画》所有。<br />\n合作相关咨询QQ：286271954。<br />\n一觉醒来就从diao丝男变成火辣美女的故事~ 一个男人（or 女人）哭笑不得的奇特体验~＋V＋","flag":0,"tags":["少年","搞笑","生活"],"author":"美蓝漫城作品"},{"conTag":"6048","cover":"http://cover2.u17i.com/2013/05/258256_1369322453_jiVlj9jjrJBA.sbig.jpg","name":"亲兄弟明算账","comicId":10817,"description":"这个故事是由一个梦引发的，但显然一个梦不可能这么长（就算真的很长我也不可能记得这么清楚\u2026\u2026囧）。所以梦的部分只有最初一小段，后面是因为觉得有趣才继续瞎搞的(<ゝω·) ~☆（番外那段帝君和一条相遇故事的笑点，玩过《古剑奇谭》的同学们应该比较能理解=v=b）","flag":0,"tags":["耽美","耽美"],"author":"乱入"},{"conTag":"4368","cover":"http://cover2.u17i.com/2015/05/3439494_1432085951_FZ8dx844ixZ5.sbig.jpg","name":"二战那些事","comicId":64219,"description":"纪念那段逝去的历史，回味那些跌宕起伏的故事.本漫画内容源自网上热议军事话题和一些不靠谱的百度百科改变而成，如有差错，请勿拍砖。","flag":0,"tags":["四格","战争"],"author":"那个黄同学~"},{"conTag":"4872","cover":"http://cover2.u17i.com/2013/05/2189876_1368773735_HbYYA4rHDbKi.sbig.jpg","name":"shades captor","comicId":32249,"description":"再繁嚣的城市，再喧闹的街道，也总有夜幕降临的时候，在那些阴森的角落里头，是谁在那虎视眈眈着，是谁在那鬼魅嘘笑着。多少的秘密，多少的泪水，正在这片无尽的寂寥中，继续无声蔓延着... ...","flag":3,"tags":["耽美","魔幻","耽美"],"author":"王子婴"},{"conTag":"4872","cover":"http://cover2.u17i.com/2016/08/14455055_1470900339_Gz92D1Jsbg2U.sbig.jpg","name":"倾国怨伶","comicId":132958,"description":"蔚詠倩和青梅竹马的爵文跟随她考古学家的父亲，来到一个朋友意外发现的没有记载的古城，这个宛若一座宫殿的城，竟是一座陵墓。这座陵墓中长眠的是一位神秘美丽的唐朝公主李盈，这样一位美丽的公主，史书上为何没有记载？本应该是素未谋面的古代公主，为何时时在詠倩梦中出现？时隔千年，这位早逝的公主居然在现代复活，还怨气冲天要杀死詠倩。鬼公主复活之谜，一场跨越千年的恩怨情仇，这个神秘的故事才刚刚开始\u2026\u2026","flag":1,"tags":["少女","魔幻","恋爱"],"author":"游素兰"},{"conTag":"9072","cover":"http://cover2.u17i.com/2016/09/768014_1474545856_mNDd60f9Wa0m.sbig.jpg","name":"皇上要出宫","comicId":136199,"description":"皇上受不了繁忙的日常，然后出宫游玩\u2026\u2026","flag":0,"tags":["少年","生活","恐怖"],"author":"刘毛毛"},{"conTag":"3528","cover":"http://cover2.u17i.com/2012/10/124212_1350360013_qYFY87Z83y3S.sbig.jpg","name":"血手弗兰克","comicId":11512,"description":"这不是一个侦探漫画\u2026\u2026这真的不是一个侦探漫画\u2026\u2026","flag":0,"tags":["少年","推理"],"author":"狼烟无言"},{"conTag":"7560","cover":"http://cover2.u17i.com/2014/06/2367294_1402039276_W1Sp95VGlSjx.sbig.png","name":"约克逊是个郡","comicId":1374,"description":"亡灵生存之地！弱肉强食之法则！\r\n不想被吃吗？！不想到处逃窜吗！？\r\n那就强大起来！\r\n战斗！战斗！战斗！","flag":3,"tags":["少年","搞笑","魔幻","动作"],"author":"极乐鸟"},{"conTag":"2688","cover":"http://cover2.u17i.com/2012/09/193749_1346573506_mms5pk9exevz.sbig.jpg","name":"请别动摇我","comicId":34519,"description":"男主杨宇在去婚礼抢婚，被其相恋四年的男友当众羞辱后发誓再不与任何有钱人有瓜葛时，生活中却闯入了一个有钱人顾维，并在其强势下步步退让，内心的誓言慢慢动摇着\u2026","flag":3,"tags":["耽美","生活","耽美"],"author":"独眼猫"},{"conTag":"2688","cover":"http://cover2.u17i.com/2012/11/2364443_1353056099_TKswswPTfFFw.sbig.jpg","name":"九鼎记","comicId":33638,"description":"番茄的小说《九鼎记》改编漫画，原创风炫动画。QQ群：274807061，欢迎催更，灌水。","flag":2,"tags":["少年","魔幻","动作"],"author":"北京业主行"},{"conTag":"5376","cover":"http://cover2.u17i.com/2016/09/16682929_1474533221_yM5w73iNPin3.sbig.jpg","name":"两界穿越戒子","comicId":136193,"description":"叶小雨得到一个可以穿梭现世和异界的戒子，由此代开异界探险寻宝之旅。","flag":0,"tags":["少年","搞笑","魔幻"],"author":"花卷里的繁星"},{"conTag":"2520","cover":"http://cover2.u17i.com/2014/10/3892974_1414031978_w2uKrkGkq166.sbig.jpg","name":"嫣然","comicId":83514,"description":"中医起源于伏羲，他发明了八卦理论。伏羲命神农和皇帝制作了九根奇针叫金黄九针。拥有九根针打开封印的人，能够拯救苍生。嫣然为了让心爱的他复活，拿着其中的一根针也开始了寻找其余八根针的旅程。武林中人为得到这九根针统一天下，开始了血腥的屠杀。","flag":1,"tags":["少年","魔幻","动作"],"author":"美蓝漫城作品"}],"hasMore":true,"page":1}}
     */

    private int code;
    private String msg;
    /**
     * stateCode : 1
     * message : 成功
     * returnData : {"comics":[{"conTag":"44520","cover":"http://cover2.u17i.com/2014/10/12647_1413948764_xeZ2KC11sccR.sbig.jpg","name":"端脑","comicId":13707,"description":"《端脑》简介：端脑是什么？如果从字面意思来讲，端脑就是由左右两个大脑组成的生物器官。在这部故事里，它用来描述由对冲宇宙构成的庞大系统，我们叫它端脑宇宙，故事从一个个未知的杀人案开始，逐步揭开掩藏在整个宇宙中的巨大秘密，从骇人听闻的阴谋，到银河系战争，从反人类的背叛到伟大的牺牲，人类从来未曾了解自己是如此的落后，如此的弱小，她将对自己的命运做出最后的一搏。","flag":1,"tags":["少年","科幻","推理","恐怖"],"author":"壁水羽"},{"conTag":"18312","cover":"http://cover2.u17i.com/2012/07/1952_1341213481_Z98LsHLH86hV.sbig.jpg","name":"大汉夜郎歌","comicId":30889,"description":"Cosplay少女、古夜郎国王子、少数民族婚服\u2026穿越？不重要！重要的是，所有的扣子只有对方才能解开！OMG\u2014\u2014想换衣服吗？跟我成亲吧~","flag":3,"tags":["少女","魔幻","恋爱","战争"],"author":"左亲"},{"conTag":"22680","cover":"http://cover2.u17i.com/2011/03/1220_1299246894_HD8fu5hf9M93.sbig.jpg","name":"女儿国传奇－胜男篇","comicId":1405,"description":"传说女儿国女尊男卑，出身贵族的男子可配得好女子，而低贱出身的男子则被随意倒卖为奴为俾。胜男是平凡无奇的现代普通女中学生，但事实并非如此，一次学校的闹鬼事件让她穿越成为女儿国身世显赫的小王爷。","flag":1,"tags":["少女","搞笑","魔幻","生活","恋爱"],"author":"王曼"},{"conTag":"17472","cover":"http://cover2.u17i.com/2015/09/814430_1441179949_RhocGCq7hbRG.sbig.jpg","name":"超能杀场","comicId":91434,"description":"为了金钱铤而走险的一场生存游戏.这里是名副其实的杀戮战场!在这里，唯一要做的就是触发能力来保全自己!!","flag":0,"tags":["少年","科幻"],"author":"阎魔大王"},{"conTag":"16296","cover":"http://cover2.u17i.com/2012/07/18708_1342409500_oUZzNesnm0rr.sbig.jpg","name":"我，女机器人1＋2部","comicId":3420,"description":"这是一个女机器人的爆笑科幻动作漫画。\r\n天才少女身患绝症离世，在未来以机器人的身躯复活！超人气科幻漫画再度开载，女机器人2，强势来袭！","flag":3,"tags":["少年","动作","科幻"],"author":"父子漫画组合"},{"conTag":"11592","cover":"http://cover2.u17i.com/2015/07/631752_1436854356_jAHE9nfeO3Me.sbig.jpg","name":"死神的阴谋","comicId":2965,"description":"什么是生，什么是死，什么是人，什么是神","flag":1,"tags":["少年","魔幻","推理","恐怖"],"author":"壁水羽"},{"conTag":"10584","cover":"http://cover2.u17i.com/2016/02/1860_1454667448_3IjH54NwlS59.sbig.jpg","name":"神契 幻奇谭","comicId":12772,"description":"官方QQ4群：161797922\r\n官方新浪微博：神契official\r\n千年前，众神离开了地球，但他们留下了各自的神器，随着华夏儿女的血脉延续传承，期待有朝一日，可以利用神器的力量重返人间\u2026鸿钧学院高中部的学生会，是一个叫做\u201c极乐池\u201d的奇怪组织，所有成员都是拥有神器的\u201c初子\u201d。新成员花仪的加入，牵扯出了\u201c极乐池\u201d会长\u2014华炼一段隐晦岁月，而九州来袭的夜晚，众人则得知了一个更加不可思议的秘密\u2026\u2026","flag":0,"tags":["少年","魔幻","动作"],"author":"L_DART"},{"conTag":"14280","cover":"http://cover2.u17i.com/2015/02/9604_1424833519_5o5cAWo2g32P.sbig.jpg","name":"某非提的逗B日常","comicId":91341,"description":"国产手游舰N同人，非提的日常记录。国之将亡，满地舰娘；玄不救非，氪不改命；绿血不大破，大破不进击；平时多攒盆，活动不伤肝。推图进沟，五见院长四T劣；日常大破，十发大建九高雄。","flag":0,"tags":["四格","生活","同人"],"author":"大米"},{"conTag":"6552","cover":"http://cover2.u17i.com/2014/10/3892974_1413371183_wcH4o4KHtpqW.sbig.jpg","name":"丑男变美女","comicId":83116,"description":"该作品版权属《美蓝漫画》所有。<br />\n合作相关咨询QQ：286271954。<br />\n一觉醒来就从diao丝男变成火辣美女的故事~ 一个男人（or 女人）哭笑不得的奇特体验~＋V＋","flag":0,"tags":["少年","搞笑","生活"],"author":"美蓝漫城作品"},{"conTag":"6048","cover":"http://cover2.u17i.com/2013/05/258256_1369322453_jiVlj9jjrJBA.sbig.jpg","name":"亲兄弟明算账","comicId":10817,"description":"这个故事是由一个梦引发的，但显然一个梦不可能这么长（就算真的很长我也不可能记得这么清楚\u2026\u2026囧）。所以梦的部分只有最初一小段，后面是因为觉得有趣才继续瞎搞的(<ゝω·) ~☆（番外那段帝君和一条相遇故事的笑点，玩过《古剑奇谭》的同学们应该比较能理解=v=b）","flag":0,"tags":["耽美","耽美"],"author":"乱入"},{"conTag":"4368","cover":"http://cover2.u17i.com/2015/05/3439494_1432085951_FZ8dx844ixZ5.sbig.jpg","name":"二战那些事","comicId":64219,"description":"纪念那段逝去的历史，回味那些跌宕起伏的故事.本漫画内容源自网上热议军事话题和一些不靠谱的百度百科改变而成，如有差错，请勿拍砖。","flag":0,"tags":["四格","战争"],"author":"那个黄同学~"},{"conTag":"4872","cover":"http://cover2.u17i.com/2013/05/2189876_1368773735_HbYYA4rHDbKi.sbig.jpg","name":"shades captor","comicId":32249,"description":"再繁嚣的城市，再喧闹的街道，也总有夜幕降临的时候，在那些阴森的角落里头，是谁在那虎视眈眈着，是谁在那鬼魅嘘笑着。多少的秘密，多少的泪水，正在这片无尽的寂寥中，继续无声蔓延着... ...","flag":3,"tags":["耽美","魔幻","耽美"],"author":"王子婴"},{"conTag":"4872","cover":"http://cover2.u17i.com/2016/08/14455055_1470900339_Gz92D1Jsbg2U.sbig.jpg","name":"倾国怨伶","comicId":132958,"description":"蔚詠倩和青梅竹马的爵文跟随她考古学家的父亲，来到一个朋友意外发现的没有记载的古城，这个宛若一座宫殿的城，竟是一座陵墓。这座陵墓中长眠的是一位神秘美丽的唐朝公主李盈，这样一位美丽的公主，史书上为何没有记载？本应该是素未谋面的古代公主，为何时时在詠倩梦中出现？时隔千年，这位早逝的公主居然在现代复活，还怨气冲天要杀死詠倩。鬼公主复活之谜，一场跨越千年的恩怨情仇，这个神秘的故事才刚刚开始\u2026\u2026","flag":1,"tags":["少女","魔幻","恋爱"],"author":"游素兰"},{"conTag":"9072","cover":"http://cover2.u17i.com/2016/09/768014_1474545856_mNDd60f9Wa0m.sbig.jpg","name":"皇上要出宫","comicId":136199,"description":"皇上受不了繁忙的日常，然后出宫游玩\u2026\u2026","flag":0,"tags":["少年","生活","恐怖"],"author":"刘毛毛"},{"conTag":"3528","cover":"http://cover2.u17i.com/2012/10/124212_1350360013_qYFY87Z83y3S.sbig.jpg","name":"血手弗兰克","comicId":11512,"description":"这不是一个侦探漫画\u2026\u2026这真的不是一个侦探漫画\u2026\u2026","flag":0,"tags":["少年","推理"],"author":"狼烟无言"},{"conTag":"7560","cover":"http://cover2.u17i.com/2014/06/2367294_1402039276_W1Sp95VGlSjx.sbig.png","name":"约克逊是个郡","comicId":1374,"description":"亡灵生存之地！弱肉强食之法则！\r\n不想被吃吗？！不想到处逃窜吗！？\r\n那就强大起来！\r\n战斗！战斗！战斗！","flag":3,"tags":["少年","搞笑","魔幻","动作"],"author":"极乐鸟"},{"conTag":"2688","cover":"http://cover2.u17i.com/2012/09/193749_1346573506_mms5pk9exevz.sbig.jpg","name":"请别动摇我","comicId":34519,"description":"男主杨宇在去婚礼抢婚，被其相恋四年的男友当众羞辱后发誓再不与任何有钱人有瓜葛时，生活中却闯入了一个有钱人顾维，并在其强势下步步退让，内心的誓言慢慢动摇着\u2026","flag":3,"tags":["耽美","生活","耽美"],"author":"独眼猫"},{"conTag":"2688","cover":"http://cover2.u17i.com/2012/11/2364443_1353056099_TKswswPTfFFw.sbig.jpg","name":"九鼎记","comicId":33638,"description":"番茄的小说《九鼎记》改编漫画，原创风炫动画。QQ群：274807061，欢迎催更，灌水。","flag":2,"tags":["少年","魔幻","动作"],"author":"北京业主行"},{"conTag":"5376","cover":"http://cover2.u17i.com/2016/09/16682929_1474533221_yM5w73iNPin3.sbig.jpg","name":"两界穿越戒子","comicId":136193,"description":"叶小雨得到一个可以穿梭现世和异界的戒子，由此代开异界探险寻宝之旅。","flag":0,"tags":["少年","搞笑","魔幻"],"author":"花卷里的繁星"},{"conTag":"2520","cover":"http://cover2.u17i.com/2014/10/3892974_1414031978_w2uKrkGkq166.sbig.jpg","name":"嫣然","comicId":83514,"description":"中医起源于伏羲，他发明了八卦理论。伏羲命神农和皇帝制作了九根奇针叫金黄九针。拥有九根针打开封印的人，能够拯救苍生。嫣然为了让心爱的他复活，拿着其中的一根针也开始了寻找其余八根针的旅程。武林中人为得到这九根针统一天下，开始了血腥的屠杀。","flag":1,"tags":["少年","魔幻","动作"],"author":"美蓝漫城作品"}],"hasMore":true,"page":1}
     */

    private DataBean data;

    public int getCode () {
        return code;
    }

    public void setCode (int code) {
        this.code = code;
    }

    public String getMsg () {
        return msg;
    }

    public void setMsg (String msg) {
        this.msg = msg;
    }

    public DataBean getData () {
        return data;
    }

    public void setData (DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private int stateCode;
        private String message;
        /**
         * comics : [{"conTag":"44520","cover":"http://cover2.u17i.com/2014/10/12647_1413948764_xeZ2KC11sccR.sbig.jpg","name":"端脑","comicId":13707,"description":"《端脑》简介：端脑是什么？如果从字面意思来讲，端脑就是由左右两个大脑组成的生物器官。在这部故事里，它用来描述由对冲宇宙构成的庞大系统，我们叫它端脑宇宙，故事从一个个未知的杀人案开始，逐步揭开掩藏在整个宇宙中的巨大秘密，从骇人听闻的阴谋，到银河系战争，从反人类的背叛到伟大的牺牲，人类从来未曾了解自己是如此的落后，如此的弱小，她将对自己的命运做出最后的一搏。","flag":1,"tags":["少年","科幻","推理","恐怖"],"author":"壁水羽"},{"conTag":"18312","cover":"http://cover2.u17i.com/2012/07/1952_1341213481_Z98LsHLH86hV.sbig.jpg","name":"大汉夜郎歌","comicId":30889,"description":"Cosplay少女、古夜郎国王子、少数民族婚服\u2026穿越？不重要！重要的是，所有的扣子只有对方才能解开！OMG\u2014\u2014想换衣服吗？跟我成亲吧~","flag":3,"tags":["少女","魔幻","恋爱","战争"],"author":"左亲"},{"conTag":"22680","cover":"http://cover2.u17i.com/2011/03/1220_1299246894_HD8fu5hf9M93.sbig.jpg","name":"女儿国传奇－胜男篇","comicId":1405,"description":"传说女儿国女尊男卑，出身贵族的男子可配得好女子，而低贱出身的男子则被随意倒卖为奴为俾。胜男是平凡无奇的现代普通女中学生，但事实并非如此，一次学校的闹鬼事件让她穿越成为女儿国身世显赫的小王爷。","flag":1,"tags":["少女","搞笑","魔幻","生活","恋爱"],"author":"王曼"},{"conTag":"17472","cover":"http://cover2.u17i.com/2015/09/814430_1441179949_RhocGCq7hbRG.sbig.jpg","name":"超能杀场","comicId":91434,"description":"为了金钱铤而走险的一场生存游戏.这里是名副其实的杀戮战场!在这里，唯一要做的就是触发能力来保全自己!!","flag":0,"tags":["少年","科幻"],"author":"阎魔大王"},{"conTag":"16296","cover":"http://cover2.u17i.com/2012/07/18708_1342409500_oUZzNesnm0rr.sbig.jpg","name":"我，女机器人1＋2部","comicId":3420,"description":"这是一个女机器人的爆笑科幻动作漫画。\r\n天才少女身患绝症离世，在未来以机器人的身躯复活！超人气科幻漫画再度开载，女机器人2，强势来袭！","flag":3,"tags":["少年","动作","科幻"],"author":"父子漫画组合"},{"conTag":"11592","cover":"http://cover2.u17i.com/2015/07/631752_1436854356_jAHE9nfeO3Me.sbig.jpg","name":"死神的阴谋","comicId":2965,"description":"什么是生，什么是死，什么是人，什么是神","flag":1,"tags":["少年","魔幻","推理","恐怖"],"author":"壁水羽"},{"conTag":"10584","cover":"http://cover2.u17i.com/2016/02/1860_1454667448_3IjH54NwlS59.sbig.jpg","name":"神契 幻奇谭","comicId":12772,"description":"官方QQ4群：161797922\r\n官方新浪微博：神契official\r\n千年前，众神离开了地球，但他们留下了各自的神器，随着华夏儿女的血脉延续传承，期待有朝一日，可以利用神器的力量重返人间\u2026鸿钧学院高中部的学生会，是一个叫做\u201c极乐池\u201d的奇怪组织，所有成员都是拥有神器的\u201c初子\u201d。新成员花仪的加入，牵扯出了\u201c极乐池\u201d会长\u2014华炼一段隐晦岁月，而九州来袭的夜晚，众人则得知了一个更加不可思议的秘密\u2026\u2026","flag":0,"tags":["少年","魔幻","动作"],"author":"L_DART"},{"conTag":"14280","cover":"http://cover2.u17i.com/2015/02/9604_1424833519_5o5cAWo2g32P.sbig.jpg","name":"某非提的逗B日常","comicId":91341,"description":"国产手游舰N同人，非提的日常记录。国之将亡，满地舰娘；玄不救非，氪不改命；绿血不大破，大破不进击；平时多攒盆，活动不伤肝。推图进沟，五见院长四T劣；日常大破，十发大建九高雄。","flag":0,"tags":["四格","生活","同人"],"author":"大米"},{"conTag":"6552","cover":"http://cover2.u17i.com/2014/10/3892974_1413371183_wcH4o4KHtpqW.sbig.jpg","name":"丑男变美女","comicId":83116,"description":"该作品版权属《美蓝漫画》所有。<br />\n合作相关咨询QQ：286271954。<br />\n一觉醒来就从diao丝男变成火辣美女的故事~ 一个男人（or 女人）哭笑不得的奇特体验~＋V＋","flag":0,"tags":["少年","搞笑","生活"],"author":"美蓝漫城作品"},{"conTag":"6048","cover":"http://cover2.u17i.com/2013/05/258256_1369322453_jiVlj9jjrJBA.sbig.jpg","name":"亲兄弟明算账","comicId":10817,"description":"这个故事是由一个梦引发的，但显然一个梦不可能这么长（就算真的很长我也不可能记得这么清楚\u2026\u2026囧）。所以梦的部分只有最初一小段，后面是因为觉得有趣才继续瞎搞的(<ゝω·) ~☆（番外那段帝君和一条相遇故事的笑点，玩过《古剑奇谭》的同学们应该比较能理解=v=b）","flag":0,"tags":["耽美","耽美"],"author":"乱入"},{"conTag":"4368","cover":"http://cover2.u17i.com/2015/05/3439494_1432085951_FZ8dx844ixZ5.sbig.jpg","name":"二战那些事","comicId":64219,"description":"纪念那段逝去的历史，回味那些跌宕起伏的故事.本漫画内容源自网上热议军事话题和一些不靠谱的百度百科改变而成，如有差错，请勿拍砖。","flag":0,"tags":["四格","战争"],"author":"那个黄同学~"},{"conTag":"4872","cover":"http://cover2.u17i.com/2013/05/2189876_1368773735_HbYYA4rHDbKi.sbig.jpg","name":"shades captor","comicId":32249,"description":"再繁嚣的城市，再喧闹的街道，也总有夜幕降临的时候，在那些阴森的角落里头，是谁在那虎视眈眈着，是谁在那鬼魅嘘笑着。多少的秘密，多少的泪水，正在这片无尽的寂寥中，继续无声蔓延着... ...","flag":3,"tags":["耽美","魔幻","耽美"],"author":"王子婴"},{"conTag":"4872","cover":"http://cover2.u17i.com/2016/08/14455055_1470900339_Gz92D1Jsbg2U.sbig.jpg","name":"倾国怨伶","comicId":132958,"description":"蔚詠倩和青梅竹马的爵文跟随她考古学家的父亲，来到一个朋友意外发现的没有记载的古城，这个宛若一座宫殿的城，竟是一座陵墓。这座陵墓中长眠的是一位神秘美丽的唐朝公主李盈，这样一位美丽的公主，史书上为何没有记载？本应该是素未谋面的古代公主，为何时时在詠倩梦中出现？时隔千年，这位早逝的公主居然在现代复活，还怨气冲天要杀死詠倩。鬼公主复活之谜，一场跨越千年的恩怨情仇，这个神秘的故事才刚刚开始\u2026\u2026","flag":1,"tags":["少女","魔幻","恋爱"],"author":"游素兰"},{"conTag":"9072","cover":"http://cover2.u17i.com/2016/09/768014_1474545856_mNDd60f9Wa0m.sbig.jpg","name":"皇上要出宫","comicId":136199,"description":"皇上受不了繁忙的日常，然后出宫游玩\u2026\u2026","flag":0,"tags":["少年","生活","恐怖"],"author":"刘毛毛"},{"conTag":"3528","cover":"http://cover2.u17i.com/2012/10/124212_1350360013_qYFY87Z83y3S.sbig.jpg","name":"血手弗兰克","comicId":11512,"description":"这不是一个侦探漫画\u2026\u2026这真的不是一个侦探漫画\u2026\u2026","flag":0,"tags":["少年","推理"],"author":"狼烟无言"},{"conTag":"7560","cover":"http://cover2.u17i.com/2014/06/2367294_1402039276_W1Sp95VGlSjx.sbig.png","name":"约克逊是个郡","comicId":1374,"description":"亡灵生存之地！弱肉强食之法则！\r\n不想被吃吗？！不想到处逃窜吗！？\r\n那就强大起来！\r\n战斗！战斗！战斗！","flag":3,"tags":["少年","搞笑","魔幻","动作"],"author":"极乐鸟"},{"conTag":"2688","cover":"http://cover2.u17i.com/2012/09/193749_1346573506_mms5pk9exevz.sbig.jpg","name":"请别动摇我","comicId":34519,"description":"男主杨宇在去婚礼抢婚，被其相恋四年的男友当众羞辱后发誓再不与任何有钱人有瓜葛时，生活中却闯入了一个有钱人顾维，并在其强势下步步退让，内心的誓言慢慢动摇着\u2026","flag":3,"tags":["耽美","生活","耽美"],"author":"独眼猫"},{"conTag":"2688","cover":"http://cover2.u17i.com/2012/11/2364443_1353056099_TKswswPTfFFw.sbig.jpg","name":"九鼎记","comicId":33638,"description":"番茄的小说《九鼎记》改编漫画，原创风炫动画。QQ群：274807061，欢迎催更，灌水。","flag":2,"tags":["少年","魔幻","动作"],"author":"北京业主行"},{"conTag":"5376","cover":"http://cover2.u17i.com/2016/09/16682929_1474533221_yM5w73iNPin3.sbig.jpg","name":"两界穿越戒子","comicId":136193,"description":"叶小雨得到一个可以穿梭现世和异界的戒子，由此代开异界探险寻宝之旅。","flag":0,"tags":["少年","搞笑","魔幻"],"author":"花卷里的繁星"},{"conTag":"2520","cover":"http://cover2.u17i.com/2014/10/3892974_1414031978_w2uKrkGkq166.sbig.jpg","name":"嫣然","comicId":83514,"description":"中医起源于伏羲，他发明了八卦理论。伏羲命神农和皇帝制作了九根奇针叫金黄九针。拥有九根针打开封印的人，能够拯救苍生。嫣然为了让心爱的他复活，拿着其中的一根针也开始了寻找其余八根针的旅程。武林中人为得到这九根针统一天下，开始了血腥的屠杀。","flag":1,"tags":["少年","魔幻","动作"],"author":"美蓝漫城作品"}]
         * hasMore : true
         * page : 1
         */

        private ReturnDataBean returnData;

        public int getStateCode () {
            return stateCode;
        }

        public void setStateCode (int stateCode) {
            this.stateCode = stateCode;
        }

        public String getMessage () {
            return message;
        }

        public void setMessage (String message) {
            this.message = message;
        }

        public ReturnDataBean getReturnData () {
            return returnData;
        }

        public void setReturnData (ReturnDataBean returnData) {
            this.returnData = returnData;
        }

        public static class ReturnDataBean {
            private boolean hasMore;
            private int page;
            /**
             * conTag : 44520
             * cover : http://cover2.u17i.com/2014/10/12647_1413948764_xeZ2KC11sccR.sbig.jpg
             * name : 端脑
             * comicId : 13707
             * description : 《端脑》简介：端脑是什么？如果从字面意思来讲，端脑就是由左右两个大脑组成的生物器官。在这部故事里，它用来描述由对冲宇宙构成的庞大系统，我们叫它端脑宇宙，故事从一个个未知的杀人案开始，逐步揭开掩藏在整个宇宙中的巨大秘密，从骇人听闻的阴谋，到银河系战争，从反人类的背叛到伟大的牺牲，人类从来未曾了解自己是如此的落后，如此的弱小，她将对自己的命运做出最后的一搏。
             * flag : 1
             * tags : ["少年","科幻","推理","恐怖"]
             * author : 壁水羽
             */

            private List<ComicsBean> comics;

            public boolean isHasMore () {
                return hasMore;
            }

            public void setHasMore (boolean hasMore) {
                this.hasMore = hasMore;
            }

            public int getPage () {
                return page;
            }

            public void setPage (int page) {
                this.page = page;
            }

            public List<ComicsBean> getComics () {
                return comics;
            }

            public void setComics (List<ComicsBean> comics) {
                this.comics = comics;
            }

            public static class ComicsBean {
                private String conTag;
                private String cover;
                private String name;
                private int comicId;
                private String description;
                private int flag;
                private String author;
                private List<String> tags;

                public String getConTag () {
                    return conTag;
                }

                public void setConTag (String conTag) {
                    this.conTag = conTag;
                }

                public String getCover () {
                    return cover;
                }

                public void setCover (String cover) {
                    this.cover = cover;
                }

                public String getName () {
                    return name;
                }

                public void setName (String name) {
                    this.name = name;
                }

                public int getComicId () {
                    return comicId;
                }

                public void setComicId (int comicId) {
                    this.comicId = comicId;
                }

                public String getDescription () {
                    return description;
                }

                public void setDescription (String description) {
                    this.description = description;
                }

                public int getFlag () {
                    return flag;
                }

                public void setFlag (int flag) {
                    this.flag = flag;
                }

                public String getAuthor () {
                    return author;
                }

                public void setAuthor (String author) {
                    this.author = author;
                }

                public List<String> getTags () {
                    return tags;
                }

                public void setTags (List<String> tags) {
                    this.tags = tags;
                }
            }
        }
    }
}
