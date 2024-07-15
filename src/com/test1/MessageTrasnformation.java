package com.test1;

public class MessageTrasnformation {
	private String messageCode;
	private String messageChannel;
	private String mesage;
	private String contentEnricher;
	private String contentFilter;
	private String claimCheck;
	private String normalizer;
	private Integer sorts;
	private String scripts;
	private String validators;
	private String entityState;

	public MessageTrasnformation() {

	}

	public MessageTrasnformation(String messageCode, String messageChannel, String mesage, String contentEnricher,
			String contentFilter, String claimCheck, String normalizer, Integer sorts, String scripts,
			String validators, String entityState) {
		super();
		this.messageCode = messageCode;
		this.messageChannel = messageChannel;
		this.mesage = mesage;
		this.contentEnricher = contentEnricher;
		this.contentFilter = contentFilter;
		this.claimCheck = claimCheck;
		this.normalizer = normalizer;
		this.sorts = sorts;
		this.scripts = scripts;
		this.validators = validators;
		this.entityState = entityState;
	}

	public String getMessageCode() {
		return messageCode;
	}

	public void setMessageCode(String messageCode) {
		this.messageCode = messageCode;
	}

	public String getMessageChannel() {
		return messageChannel;
	}

	public void setMessageChannel(String messageChannel) {
		this.messageChannel = messageChannel;
	}

	public String getMesage() {
		return mesage;
	}

	public void setMesage(String mesage) {
		this.mesage = mesage;
	}

	public String getContentEnricher() {
		return contentEnricher;
	}

	public void setContentEnricher(String contentEnricher) {
		this.contentEnricher = contentEnricher;
	}

	public String getContentFilter() {
		return contentFilter;
	}

	public void setContentFilter(String contentFilter) {
		this.contentFilter = contentFilter;
	}

	public String getClaimCheck() {
		return claimCheck;
	}

	public void setClaimCheck(String claimCheck) {
		this.claimCheck = claimCheck;
	}

	public String getNormalizer() {
		return normalizer;
	}

	public void setNormalizer(String normalizer) {
		this.normalizer = normalizer;
	}

	public Integer getSorts() {
		return sorts;
	}

	public void setSorts(Integer sorts) {
		this.sorts = sorts;
	}

	public String getScripts() {
		return scripts;
	}

	public void setScripts(String scripts) {
		this.scripts = scripts;
	}

	public String getValidators() {
		return validators;
	}

	public void setValidators(String validators) {
		this.validators = validators;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
