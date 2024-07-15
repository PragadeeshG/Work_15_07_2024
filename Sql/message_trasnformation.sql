create table if not exists message_trasnformation(
message_code varchar(255) not null,
message_channel varchar(255) null,
mesage varchar(255) null,
content_enricher varchar(255) null,
content_filter varchar(255) null,
claim_check varchar(255) null,
normalizer varchar(255) null,
sorts Integer null,
scripts varchar(255) null,
validators varchar(255) null,
entity_state varchar(255) null,
constraint message_trasnformation_pk primary key(message_code));