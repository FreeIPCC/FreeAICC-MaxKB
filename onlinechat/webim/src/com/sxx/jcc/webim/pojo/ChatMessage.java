package com.sxx.jcc.webim.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

import com.sxx.jcc.common.utils.XKTools;
import com.sxx.jcc.common.utils.event.UserEvent;

@Entity
@Table(name = "xk_chat_message")
public class ChatMessage implements java.io.Serializable ,UserEvent{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3520656734252136303L;
	
	private String id = XKTools.getUUID();
	private String appid ;
	private String userid ;
	private String username ;
	
	private String aiid ;
	
	
	private String touser ;
	private String tousername ;
	
	private boolean cooperation ;
	
	private boolean filterscript ;
	
	private String msgtype ;
	private String creater; 
	private String usession ;
	private String agentserviceid ;
	
	private String sessionid ;	//增加记录 AI 的 Client Session ID
	
	private String topicid ;	//命中的 知识库 ID
	private String topicatid ;	//命中的知识库分类ID
	private boolean topic ;		//是否命中知识库
	private boolean aichat ;	//是否和AI提问
	
	private String message ;
	private String expmsg ;		//显示消息
	
	private boolean readstatus ;
	private boolean useful ;	//回答是否有用
	private String notreason ;	//知识回答无用的原因
	
	private Date usetime ;		//最后一次评价时间
	
	private String orgi ;
	private String channel ;
	private String model ;			//消息所属模块， WebIM/EntIM
	private String chatype ;		//对话类型，是私聊还是群聊 或者是智能机器人对话
	private Date lastagentmsgtime ;	//前一条的坐席发送消息时间
	private Date lastmsgtime ;		//前一条的访客发送消息时间
	private int agentreplytime ;	//坐席回复消息时长		单位：秒
	private int agentreplyinterval ;//坐席回复消息时间间隔 ， 单位：秒
	
	private String batid ;		//变更用处，修改为是否有协作保存的图片
	
	private String headimgurl ;		//用户头像 ，临时用
	
	private String filename ;		//文件名
	private int filesize ;			//文件尺寸
	private String attachmentid ;	//附件ID
	
	private boolean datastatus ;	//数据状态，是否已撤回消息	
	
	private String ckind ;			//问答分类
	private String ckindname ;		//问答分类名称
	
	private String clabel ;			//问答标签
	private String clabelname ;		//问答标签名称
	
	private String matchtype ;		//匹配状态
	
	private String mediaid ;
	private String locx ;	//location x
	private String locy ;	//location y
	
	private Date updatetime = new Date();
	
	private int duration ;	//音频时长
	
	private String title ;	//标题
	private String qusid ;	//问题ID
	private String code ;	//代码
	private String score ;	//分值
	private String url ;	//图文跳转URL
	private String bustype ;	//扩展业务类型
	
	private String scale ;		//地图级别 
	private String suggestmsg ;	//推荐消息
	
	private boolean quickagent ;//有错误消息 强制快速转人工坐席
	
	private int tokenum ; 	//当前未读消息数量
	private String agentuser ;	
	
	public String getAppid() {
		return appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsession() {
		return usession;
	}
	public void setUsession(String usession) {
		this.usession = usession;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public String getOrgi() {
		return orgi;
	}

	public void setOrgi(String orgi) {
		this.orgi = orgi;
	}

	public String getTouser() {
		return touser;
	}

	public void setTouser(String touser) {
		this.touser = touser;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTousername() {
		return tousername;
	}

	public void setTousername(String tousername) {
		this.tousername = tousername;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}
	private String type ;		// 类型有两种 ， 一种 message ， 一种 writing
	private String contextid ;
	private String calltype ;
	private String createtime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getContextid() {
		return contextid;
	}

	public void setContextid(String contextid) {
		this.contextid = contextid;
	}

	public String getCalltype() {
		return calltype;
	}

	public void setCalltype(String calltype) {
		this.calltype = calltype;
	}

	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	@Id
	@Column(length = 32)
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy="uuid")	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getChatype() {
		return chatype;
	}
	public void setChatype(String chatype) {
		this.chatype = chatype;
	}
	public String getAgentserviceid() {
		return agentserviceid;
	}
	public void setAgentserviceid(String agentserviceid) {
		this.agentserviceid = agentserviceid;
	}
	@Transient
	public int getTokenum() {
		return tokenum;
	}
	public void setTokenum(int tokenum) {
		this.tokenum = tokenum;
	}
	@Transient
	public String getAgentuser() {
		return agentuser;
	}
	public void setAgentuser(String agentuser) {
		this.agentuser = agentuser;
	}
	public String getHeadimgurl() {
		return headimgurl;
	}
	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
	}
	public String getMsgtype() {
		return msgtype;
	}
	public void setMsgtype(String msgtype) {
		this.msgtype = msgtype;
	}
	public String getCreater() {
		return creater;
	}
	public void setCreater(String creater) {
		this.creater = creater;
	}
	public String getMediaid() {
		return mediaid;
	}
	public void setMediaid(String mediaid) {
		this.mediaid = mediaid;
	}
	public String getLocx() {
		return locx;
	}
	public void setLocx(String locx) {
		this.locx = locx;
	}
	public String getLocy() {
		return locy;
	}
	public void setLocy(String locy) {
		this.locy = locy;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getScale() {
		return scale;
	}
	public void setScale(String scale) {
		this.scale = scale;
	}

	
	public Date getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public int getFilesize() {
		return filesize;
	}
	public void setFilesize(int filesize) {
		this.filesize = filesize;
	}
	public String getAttachmentid() {
		return attachmentid;
	}
	public void setAttachmentid(String attachmentid) {
		this.attachmentid = attachmentid;
	}
	public Date getLastagentmsgtime() {
		return lastagentmsgtime;
	}
	public void setLastagentmsgtime(Date lastagentmsgtime) {
		this.lastagentmsgtime = lastagentmsgtime;
	}
	public int getAgentreplytime() {
		return agentreplytime;
	}
	public void setAgentreplytime(int agentreplytime) {
		this.agentreplytime = agentreplytime;
	}
	public Date getLastmsgtime() {
		return lastmsgtime;
	}
	public void setLastmsgtime(Date lastmsgtime) {
		this.lastmsgtime = lastmsgtime;
	}
	public int getAgentreplyinterval() {
		return agentreplyinterval;
	}
	public void setAgentreplyinterval(int agentreplyinterval) {
		this.agentreplyinterval = agentreplyinterval;
	}
	public String getSessionid() {
		return sessionid;
	}
	public void setSessionid(String sessionid) {
		this.sessionid = sessionid;
	}
	public String getBatid() {
		return batid;
	}
	public void setBatid(String batid) {
		this.batid = batid;
	}
	public boolean isCooperation() {
		return cooperation;
	}
	public void setCooperation(boolean cooperation) {
		this.cooperation = cooperation;
	}
	public boolean isDatastatus() {
		return datastatus;
	}
	public void setDatastatus(boolean datastatus) {
		this.datastatus = datastatus;
	}
	public String getTopicid() {
		return topicid;
	}
	public void setTopicid(String topicid) {
		this.topicid = topicid;
	}
	public String getTopicatid() {
		return topicatid;
	}
	public void setTopicatid(String topicatid) {
		this.topicatid = topicatid;
	}
	public boolean isTopic() {
		return topic;
	}
	public void setTopic(boolean topic) {
		this.topic = topic;
	}
	public boolean isAichat() {
		return aichat;
	}
	public void setAichat(boolean aichat) {
		this.aichat = aichat;
	}
	public String getAiid() {
		return aiid;
	}
	public void setAiid(String aiid) {
		this.aiid = aiid;
	}
	public String getExpmsg() {
		return expmsg;
	}
	public void setExpmsg(String expmsg) {
		this.expmsg = expmsg;
	}
	public String getSuggestmsg() {
		return suggestmsg;
	}
	public void setSuggestmsg(String suggestmsg) {
		this.suggestmsg = suggestmsg;
	}
	public boolean isReadstatus() {
		return readstatus;
	}
	public void setReadstatus(boolean readstatus) {
		this.readstatus = readstatus;
	}
	public boolean isUseful() {
		return useful;
	}
	public void setUseful(boolean useful) {
		this.useful = useful;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getQusid() {
		return qusid;
	}
	public void setQusid(String qusid) {
		this.qusid = qusid;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Date getUsetime() {
		return usetime;
	}
	public void setUsetime(Date usetime) {
		this.usetime = usetime;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getBustype() {
		return bustype;
	}
	public void setBustype(String bustype) {
		this.bustype = bustype;
	}
	public String getNotreason() {
		return notreason;
	}
	public void setNotreason(String notreason) {
		this.notreason = notreason;
	}
	public boolean isQuickagent() {
		return quickagent;
	}
	public void setQuickagent(boolean quickagent) {
		this.quickagent = quickagent;
	}
	public String getMatchtype() {
		return matchtype;
	}
	public void setMatchtype(String matchtype) {
		this.matchtype = matchtype;
	}
	public String getCkind() {
		return ckind;
	}
	public void setCkind(String ckind) {
		this.ckind = ckind;
	}
	public String getCkindname() {
		return ckindname;
	}
	public void setCkindname(String ckindname) {
		this.ckindname = ckindname;
	}
	public String getClabel() {
		return clabel;
	}
	public void setClabel(String clabel) {
		this.clabel = clabel;
	}
	public String getClabelname() {
		return clabelname;
	}
	public void setClabelname(String clabelname) {
		this.clabelname = clabelname;
	}
	public boolean isFilterscript() {
		return filterscript;
	}
	public void setFilterscript(boolean filterscript) {
		this.filterscript = filterscript;
	}
}
