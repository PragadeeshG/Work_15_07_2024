create table if not exists messaging_end_points(
messaging_mapper Integer not null,
event_driven_consumer varchar(255) null,
polling_consumer char null,
competing_consumers Integer null,
gauranteed_delivery varchar(255) null,
message_dispatcher varchar(255) null,
selective_consumer Integer null,
durable_subscriber Integer null,
idempotent_consumer varchar(255) null,
resumable_consumer Integer null,
transactional_client varchar(255) null,
messaging_gateway varchar(255) null,
service_activator varchar(255) null,
constraint messaging_end_points_pk primary key(messaging_mapper));