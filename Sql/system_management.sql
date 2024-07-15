create table if not exists system_management(
control_bus Integer not null,
detour Integer null,
dynamic_router varchar(255) null,
wire_tap varchar(255) null,
splittor varchar(255) null,
message_history varchar(255) null,
resequenced char null,
composed_message_processor varchar(255) null,
logs varchar(255) null,
steps varchar(255) null,
scripting_language varchar(255) null,
default_encryptor varchar(255) null,
encoder varchar(255) null,
derived_encoder varchar(255) null,
default_decoder varchar(255) null,
multi_cast varchar(255) null,
loops_available char null,
service_call varchar(255) null,
entity_state varchar(255) null,
remarks varchar(255) null,
constraint system_management_pk primary key(control_bus));