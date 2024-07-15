package com.test1;

public class MessagingEndPoints {
	private Integer messagingMapper;
	private String eventDrivenConsumer;
	private boolean pollingConsumer;
	private Integer competingConsumers;
	private String gauranteedDelivery;
	private String messageDispatcher;
	private Integer selectiveConsumer;
	private Integer durableSubscriber;
	private String idempotentConsumer;
	private Integer resumableConsumer;
	private String transactionalClient;
	private String messagingGateway;
	private String serviceActivator;

	public MessagingEndPoints() {

	}

	public MessagingEndPoints(Integer messagingMapper, String eventDrivenConsumer, boolean pollingConsumer,
			Integer competingConsumers, String gauranteedDelivery, String messageDispatcher, Integer selectiveConsumer,
			Integer durableSubscriber, String idempotentConsumer, Integer resumableConsumer, String transactionalClient,
			String messagingGateway, String serviceActivator) {
		super();
		this.messagingMapper = messagingMapper;
		this.eventDrivenConsumer = eventDrivenConsumer;
		this.pollingConsumer = pollingConsumer;
		this.competingConsumers = competingConsumers;
		this.gauranteedDelivery = gauranteedDelivery;
		this.messageDispatcher = messageDispatcher;
		this.selectiveConsumer = selectiveConsumer;
		this.durableSubscriber = durableSubscriber;
		this.idempotentConsumer = idempotentConsumer;
		this.resumableConsumer = resumableConsumer;
		this.transactionalClient = transactionalClient;
		this.messagingGateway = messagingGateway;
		this.serviceActivator = serviceActivator;
	}

	public Integer getMessagingMapper() {
		return messagingMapper;
	}

	public void setMessagingMapper(Integer messagingMapper) {
		this.messagingMapper = messagingMapper;
	}

	public String getEventDrivenConsumer() {
		return eventDrivenConsumer;
	}

	public void setEventDrivenConsumer(String eventDrivenConsumer) {
		this.eventDrivenConsumer = eventDrivenConsumer;
	}

	public boolean isPollingConsumer() {
		return pollingConsumer;
	}

	public void setPollingConsumer(boolean pollingConsumer) {
		this.pollingConsumer = pollingConsumer;
	}

	public Integer getCompetingConsumers() {
		return competingConsumers;
	}

	public void setCompetingConsumers(Integer competingConsumers) {
		this.competingConsumers = competingConsumers;
	}

	public String getGauranteedDelivery() {
		return gauranteedDelivery;
	}

	public void setGauranteedDelivery(String gauranteedDelivery) {
		this.gauranteedDelivery = gauranteedDelivery;
	}

	public String getMessageDispatcher() {
		return messageDispatcher;
	}

	public void setMessageDispatcher(String messageDispatcher) {
		this.messageDispatcher = messageDispatcher;
	}

	public Integer getSelectiveConsumer() {
		return selectiveConsumer;
	}

	public void setSelectiveConsumer(Integer selectiveConsumer) {
		this.selectiveConsumer = selectiveConsumer;
	}

	public Integer getDurableSubscriber() {
		return durableSubscriber;
	}

	public void setDurableSubscriber(Integer durableSubscriber) {
		this.durableSubscriber = durableSubscriber;
	}

	public String getIdempotentConsumer() {
		return idempotentConsumer;
	}

	public void setIdempotentConsumer(String idempotentConsumer) {
		this.idempotentConsumer = idempotentConsumer;
	}

	public Integer getResumableConsumer() {
		return resumableConsumer;
	}

	public void setResumableConsumer(Integer resumableConsumer) {
		this.resumableConsumer = resumableConsumer;
	}

	public String getTransactionalClient() {
		return transactionalClient;
	}

	public void setTransactionalClient(String transactionalClient) {
		this.transactionalClient = transactionalClient;
	}

	public String getMessagingGateway() {
		return messagingGateway;
	}

	public void setMessagingGateway(String messagingGateway) {
		this.messagingGateway = messagingGateway;
	}

	public String getServiceActivator() {
		return serviceActivator;
	}

	public void setServiceActivator(String serviceActivator) {
		this.serviceActivator = serviceActivator;
	}

}