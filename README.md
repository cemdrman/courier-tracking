# courier-tracking

For PostgreSQL

docker run -p 5050:80 -e 'PGADMIN_DEFAULT_EMAIL=pgadmin4@pgadmin.org' -e 'PGADMIN_DEFAULT_PASSWORD=admin' -d --name pgadmin4 dpage/pgadmin4

Run following scripts

INSERT INTO public.point(
	latitude, longitude, id)
	VALUES (1, 40.9923307, 29.1244229);
    
INSERT INTO public.point(
	latitude, longitude, id)
	VALUES (2, 40.986106, 29.1161293);
    
INSERT INTO public.point(
	latitude, longitude, id)
	VALUES (3, 41.0066851, 28.6552262);
    
INSERT INTO public.point(
	latitude, longitude, id)
	VALUES (4, 41.055783, 29.0210292);
    
INSERT INTO public.point(
	latitude, longitude, id)
	VALUES (5, 40.9632463, 29.0630908);
  
  
INSERT INTO public.store(
	id, name, point_id)
	VALUES (1, 'Ataşehir MMM Migros',  1);
    
INSERT INTO public.store(
	id, name, point_id)
	VALUES (2, 'Novada MMM Migros', 2);
    
INSERT INTO public.store(
	id, name, point_id)
	VALUES (3,'Beylikdüzü 5M Migros', 3);
    
INSERT INTO public.store(
	id, name, point_id)
	VALUES (4, 'Ortaköy MMM Migros', 4);
    
INSERT INTO public.store(
	id, name, point_id)
	VALUES (5, 'Caddebostan MMM Migros', 5);
    
